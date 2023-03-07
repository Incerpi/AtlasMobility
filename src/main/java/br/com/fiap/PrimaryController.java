package br.com.fiap;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import br.com.fiap.DAO.ClienteDao;
import br.com.fiap.DAO.LocalizacaoDao;
import br.com.fiap.DAO.DestinoDao;
import br.com.fiap.DAO.TrajetoDao;
import br.com.fiap.DAO.UsuarioDao;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Destino;
import br.com.fiap.model.Localizacao;
import br.com.fiap.model.Trajeto;
import br.com.fiap.model.Usuario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController implements Initializable{
    
    //CLIENTE//
    
    @FXML private TextField textFieldNomeCliente;
    @FXML private TextField textFieldCpfCliente;
    @FXML private TextField textFieldTelefoneCliente;
    @FXML private TextField textFieldEmailCliente;
    @FXML private ListView<Cliente> listView;
    private ClienteDao clienteDao;
    
    //LOCALIZAÇÃO//
    
    @FXML private TextField textFieldEnderecoLocalizacao;
    @FXML private TextField textFieldCidadeLocalizacao;
    @FXML private TextField textFieldEstadoLocalizacao;

    //DESTINO//
    
    @FXML private TextField textFieldEnderecoDestino;
    @FXML private TextField textFieldCidadeDestino;
    @FXML private TextField textFieldEstadoDestino;
    
    //TRAJETO//

    @FXML private TextField textFieldVeiculo;
    @FXML private TextField textFieldHorarioSaida;
    @FXML private TextField textFieldPrevisaoChegada;
    @FXML private ListView<Trajeto> listView2;
    private TrajetoDao trajetoDao;

    //USUARIO//

    @FXML private TextField textFieldNomeUsuario;
    @FXML private TextField textFieldSenhaUsuario;


    //CLIENTE//

    public PrimaryController(){
            clienteDao = new ClienteDao();
            trajetoDao = new TrajetoDao();
        }

    private Cliente carregarClienteDoFormulario(){
        String nomeCliente = textFieldNomeCliente.getText();
        int cpfCliente = Integer.valueOf(textFieldCpfCliente.getText());
        int telefoneCliente = Integer.valueOf(textFieldTelefoneCliente.getText());
        String emailCliente = textFieldEmailCliente.getText();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, telefoneCliente, emailCliente);
        return cliente;
    }

    public void salvarCliente() throws IOException{
        try {
            ClienteDao.inserirCliente(carregarClienteDoFormulario());
            LimparFormulario();
        } catch (SQLException e) {
           System.out.println("Erro de SQL. " + e.getMessage());
        }
    }

    private void mostrarAlerta(String mensagem){
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setContentText(mensagem);
        alerta.show();
    }

    private void atualizarListaCliente(List<Cliente> lista){
        listView.getItems().clear();
        listView.getItems().addAll(lista);
    }

    public void mostrarTodosClientes(){
        try {
            List<Cliente> lista = clienteDao.listarTodosClientes();
            atualizarListaCliente(lista);
        } catch (SQLException e) {
            mostrarAlerta("Erro de SQL " + e.getMessage());
        }
    }

    //LOCALIZAÇÃO//

    private Localizacao carregarLocalizacaoDoFormulario(){
        String enderecoLocalizacao = textFieldEnderecoLocalizacao.getText();
        String cidadeLocalizacao = textFieldCidadeLocalizacao.getText();
        String estadoLocalizacao = textFieldEstadoLocalizacao.getText();

        Localizacao localizacao = new Localizacao(enderecoLocalizacao, cidadeLocalizacao, estadoLocalizacao);
        return localizacao;
    }

    public void salvarLocalizacao() throws IOException{
        try {
           LocalizacaoDao.inserirLocalizacao(carregarLocalizacaoDoFormulario());
           LimparFormulario();
        } catch (SQLException e) {
           System.out.println("Erro de SQL. " + e.getMessage());
        }
    }

    //DESTINO//

    private Destino carregarDestinoDoFormulario(){
        String enderecoDestino = textFieldEnderecoDestino.getText();
        String cidadeDestino = textFieldCidadeDestino.getText();
        String estadoDestino = textFieldEstadoDestino.getText();


        Destino destino = new Destino(enderecoDestino, cidadeDestino, estadoDestino);
        return destino;
    }

    public void salvarDestino() throws IOException{
        try {
           DestinoDao.inserirDestino(carregarDestinoDoFormulario());
           LimparFormulario();
        } catch (SQLException e) {
           System.out.println("Erro de SQL. " + e.getMessage());
        }
    }

    //TRAJETO//

    private Trajeto carregarTrajetoDoFormulario(){
        String veiculoTrajeto = textFieldVeiculo.getText();
        String horarioSaidaTrajeto = textFieldHorarioSaida.getText();
        String previsaoChegada = textFieldPrevisaoChegada.getText();


        Trajeto trajeto = new Trajeto(veiculoTrajeto, horarioSaidaTrajeto, previsaoChegada);
        return trajeto;
    }

    public void salvarTrajeto() throws IOException{
        try {
           TrajetoDao.inserirTrajeto(carregarTrajetoDoFormulario());
           LimparFormulario();
        } catch (SQLException e) {
           System.out.println("Erro de SQL. " + e.getMessage());
        }
    }

    private void atualizarListaTrajetos(List<Trajeto> lista2){
        listView2.getItems().clear();
        listView2.getItems().addAll(lista2);
    }

    public void mostrarTodosTrajetos(){
        try {
            List<Trajeto> lista2 = trajetoDao.listarTodosTrajetos();
            atualizarListaTrajetos(lista2);
        } catch (SQLException e) {
            mostrarAlerta("Erro de SQL " + e.getMessage());
        }
    }

    //USUARIO//

    private Usuario carregarUsuarioDoFormulario(){
        String nomeUsuario= textFieldNomeUsuario.getText();
        String senhaUsuario = textFieldSenhaUsuario.getText();


        Usuario usuario = new Usuario(nomeUsuario, senhaUsuario);
        return usuario;
    }

    public void salvarUsuario() throws IOException{
        try {
           UsuarioDao.inserirUsuario(carregarUsuarioDoFormulario());
           LimparFormulario();
        } catch (SQLException e) {
           System.out.println("Erro de SQL. " + e.getMessage());
        }
    }

    private void LimparFormulario(){
         textFieldNomeCliente.setText("");
         textFieldCpfCliente.setText("");
         textFieldTelefoneCliente.setText("");
         textFieldEmailCliente.setText("");
         textFieldEnderecoLocalizacao.setText("");
         textFieldCidadeLocalizacao.setText("");
         textFieldEstadoLocalizacao.setText("");
         textFieldEnderecoDestino.setText("");
         textFieldCidadeDestino.setText("");
         textFieldEstadoDestino.setText("");
         textFieldVeiculo.setText("");
         textFieldHorarioSaida.setText("");
         textFieldPrevisaoChegada.setText("");
         textFieldNomeUsuario.setText("");
         textFieldSenhaUsuario.setText("");
     }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
    }

}