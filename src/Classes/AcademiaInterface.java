package Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcademiaInterface {
  private JFrame frame;
  private JButton botaoAluno;
  private JButton botaoFuncionario;
  private JButton botaoProfessor;
  private JButton botaoGerente;
  private JButton botaoRecepcionista;

  public AcademiaInterface() {
    criarJanela();
    adicionarComponentes();
    configurarAcoes();
  }

  private void criarJanela() {
    frame = new JFrame("Sistema de Academia");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setLayout(new FlowLayout());
  }

  private void adicionarComponentes() {
    botaoAluno = new JButton("Aluno");
    botaoFuncionario = new JButton("Funcionário");
    botaoProfessor = new JButton("Professor");
    botaoGerente = new JButton("Gerente");
    botaoRecepcionista = new JButton("Recepcionista");

    frame.add(botaoAluno);
    frame.add(botaoFuncionario);
  }

  private void configurarAcoes() {
    botaoAluno.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        exibirTelaLoginAluno();
      }
    });

    botaoFuncionario.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        exibirTelaSelecaoFuncionario();
      }
    });

    botaoProfessor.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        exibirTelaLoginProfessor();
      }
    });

    botaoGerente.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        exibirTelaLoginGerente();
      }
    });

    botaoRecepcionista.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        exibirTelaLoginRecepcionista();
      }
    });
  }

  private void exibirTelaLoginAluno() {
    frame.getContentPane().removeAll();
    frame.revalidate();
    frame.repaint();

    JLabel labelNome = new JLabel("Nome do Aluno:");
    JTextField campoNome = new JTextField(20);
    JLabel labelSenha = new JLabel("Senha:");
    JPasswordField campoSenha = new JPasswordField(20);
    JButton botaoAcessarTreino = new JButton("Acessar Treino");

    frame.add(labelNome);
    frame.add(campoNome);
    frame.add(labelSenha);
    frame.add(campoSenha);
    frame.add(botaoAcessarTreino);

    botaoAcessarTreino.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String nomeAluno = campoNome.getText();
        new String(campoSenha.getPassword());
        // Apresentar treino do aluno
        JOptionPane.showMessageDialog(frame, "Acessando treino do aluno: " + nomeAluno);
      }
    });

    frame.pack();
  }

  private void exibirTelaSelecaoFuncionario() {
    frame.getContentPane().removeAll();
    frame.revalidate();
    frame.repaint();

    frame.add(botaoProfessor);
    frame.add(botaoGerente);
    frame.add(botaoRecepcionista);

    frame.pack();
  }

  private void exibirTelaLoginProfessor() {
    frame.getContentPane().removeAll();
    frame.revalidate();
    frame.repaint();

    JLabel labelNome = new JLabel("Nome do Professor:");
    JTextField campoNome = new JTextField(20);
    JLabel labelSenha = new JLabel("Senha:");
    JPasswordField campoSenha = new JPasswordField(20);
    JButton botaoLogin = new JButton("Login");

    frame.add(labelNome);
    frame.add(campoNome);
    frame.add(labelSenha);
    frame.add(campoSenha);
    frame.add(botaoLogin);

    botaoLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String nomeProfessor = campoNome.getText();
        new String(campoSenha.getPassword());
        // Como realizar o login do professor?
        JOptionPane.showMessageDialog(frame, "Realizando login do professor: " + nomeProfessor);
      }
    });

    frame.pack();
  }

  private void exibirTelaLoginGerente() {
    frame.getContentPane().removeAll();
    frame.revalidate();
    frame.repaint();

    JLabel labelNome = new JLabel("Nome do Gerente:");
    JTextField campoNome = new JTextField(20);
    JLabel labelSenha = new JLabel("Senha:");
    JPasswordField campoSenha = new JPasswordField(20);
    JButton botaoLogin = new JButton("Login");

    frame.add(labelNome);
    frame.add(campoNome);
    frame.add(labelSenha);
    frame.add(campoSenha);
    frame.add(botaoLogin);

    botaoLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String nomeGerente = campoNome.getText();
        new String(campoSenha.getPassword());
          // Como realizar o login do gerente?
          JOptionPane.showMessageDialog(frame, "Realizando login do gerente: " + nomeGerente);
        }
    });

    frame.pack();
  }

  private void exibirTelaLoginRecepcionista() {
    frame.getContentPane().removeAll();
    frame.revalidate();
    frame.repaint();

    JLabel labelNome = new JLabel("Nome do Recepcionista:");
    JTextField campoNome = new JTextField(20);
    JLabel labelSenha = new JLabel("Senha:");
    JPasswordField campoSenha = new JPasswordField(20);
    JButton botaoLogin = new JButton("Login");

    frame.add(labelNome);
    frame.add(campoNome);
    frame.add(labelSenha);
    frame.add(campoSenha);
    frame.add(botaoLogin);

    botaoLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String nomeRecepcionista = campoNome.getText();
        new String(campoSenha.getPassword());
        // Como realizar o login do recepcionista?
        JOptionPane.showMessageDialog(frame, "Realizando login do recepcionista: " + nomeRecepcionista);
      }
    });

    frame.pack();
  }

  public void exibir() {
    frame.setVisible(true);
  }

}
