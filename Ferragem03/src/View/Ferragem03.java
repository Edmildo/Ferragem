
package View;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Model.Produto;
import Model.Cliente;
import java.sql.Date;
import Controller.ProdutoDAO;
import Controller.ClienteDAO;
import Controller.BDConexao;
import java.text.SimpleDateFormat;
import Controller.FuncionarioDAO;
import Model.Cliente;
import Controller.GerenteDAO;
import Model.Gerente;
import Model.Venda;
import Controller.VendaDAO;
import java.time.LocalDate;
import Model.Fornecedor;
import Controller.FornecedorDAO;
public class Ferragem03 {

    public Ferragem03() {
        this.criar();
    }


        public void criar(){
        Color azul=new Color(73,196,209);
        JFrame janela=new JFrame();
        janela.setSize(650, 450);
        janela.setTitle("Login");
        janela.setResizable(false);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=janela.getContentPane();
        c.setLayout(null);
        JPanel p1=new JPanel();
        p1.setBackground(Color.GRAY);
        p1.setBounds(0, 0, 300, 450);
        JLabel lbl1=new JLabel();
        p1.setLayout(null);
        lbl1.setIcon(new ImageIcon("Ferragem.jpg"));
        lbl1.setBounds(67, 25, 200, 300);
        JLabel lbl2=new JLabel();
        lbl2.setText("Bem Vindo!");
        lbl2.setBounds(101, 10, 100, 40);
        lbl2.setFont(new Font("Times New Roman", Font.BOLD,20));
        lbl2.setForeground(Color.lightGray);
        JLabel lbl3=new JLabel();
        lbl3.setText("Ferragem MM Langa");
        lbl3.setBounds(55, 300, 200, 40);
        lbl3.setFont(new Font("Times New Roman", Font.BOLD,20));
        lbl3.setForeground(Color.lightGray);
        p1.add(lbl3);
        p1.add(lbl2);
        p1.add(lbl1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(300, 0, 350, 450);
        p2.setBackground(Color.white);
        JButton logout=new JButton("LogOut");
        logout.setFocusable(false);
        logout.setBackground(Color.white);
        logout.setForeground(Color.BLUE);
        logout.setBounds(220, 0, 100, 30);
        logout.setFont(new Font("Times New Roman", Font.PLAIN,20));
        p2.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 JFrame jan=new JFrame();
                        jan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jan.setSize(298,140);
                        Container c=jan.getContentPane();
                        c.setLayout(new GridLayout(2, 1));
                        c.setBackground(Color.BLUE);
                        JPanel p1=new JPanel();
                        p1.setLayout(new GridLayout(1, 1));
                        JPanel p2=new JPanel();
                        p2.setLayout(new FlowLayout());
                        JLabel sair=new JLabel("   Tem Certeza de que Deseja encerrar o caixa?");
                        sair.setForeground(Color.BLACK);
                        JButton b1=new JButton("SIM");
                        b1.setFocusable(false);
                        b1.setBackground(Color.cyan);
                        JButton b2=new JButton("NAO");
                        b2.setBackground(Color.cyan);
                        b2.setFocusable(false);
                        b1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                jan.setVisible(false);
                                janela.setVisible(false);
                                System.exit(0);
                            }
                        });
                         b2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                jan.setVisible(false);
                            }
                        });
                        p1.add(sair);
                        p2.add(b1);
                        p2.add(b2);
                        c.add(p1);
                        c.add(p2);
                        jan.setVisible(true);
                        jan.setLocationRelativeTo(null);
                    }
                });
        
        JLabel lbl4=new JLabel("Usuario");
        lbl4.setBounds(20, 105, 100,40);
        JTextField txt1=new JTextField("");
        txt1.setText("");
        txt1.setFont(new Font("Times New Roman", Font.PLAIN,20));
        txt1.setBounds(20, 150, 300, 40);
        p2.add(lbl4);
        p2.add(txt1);
        
         JLabel lbl5=new JLabel("Senha");
        lbl5.setBounds(20, 205, 100,40);
        //JTextField txt2=new JTextField();
        JPasswordField txt2=new JPasswordField("");
        txt2.setText("");
        txt2.setFont(new Font("Times New Roman", Font.PLAIN,22));
        txt2.setBounds(20, 250, 300, 40);
        p2.add(lbl5);
        p2.add(txt2);
        
        JButton bt1=new JButton("Gerente");
        bt1.setBounds(60, 330, 100, 30);
        bt1.setBackground(Color.BLUE);
        bt1.setForeground(Color.WHITE);
        bt1.setFocusable(false);
        JButton bt2=new JButton("Funcionario");
        bt2.setBackground(Color.BLUE);
        bt2.setFocusable(false);
         bt2.setForeground(Color.WHITE);
         bt2.setBounds(180, 330, 100, 30);
        p2.add(bt1);
        p2.add(bt2);

        
        
        
        
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 GerenteDAO gere=new GerenteDAO(); 
                /* String n="", codig="";
            for(int i=0; i<gere.todos().size();i++){
               if(gere.todos().get(i).getNome().equalsIgnoreCase(txt1.getText())  && gere.todos().get(i).getCodigo().equalsIgnoreCase(txt2.getText())){
                   n=gere.todos().get(i).getNome();
                   codig=gere.todos().get(i).getCodigo();
                    
                    
               }
            }
            if(txt1.getText().equalsIgnoreCase("") || txt2.getText().equalsIgnoreCase("")){
                 JOptionPane.showMessageDialog(null, "Dados Invalidos", "Titulo", JOptionPane.ERROR_MESSAGE);

            }
                           
            else if(n.equals(txt1.getText())  && codig.equals(txt2.getText())){

                */
                JFrame janela2=new JFrame();
                janela2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                janela2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                janela2.setSize(900, 500);
                Container c2=janela2.getContentPane();
                c2.setLayout(null);
                
                JPanel pa1=new JPanel();
                pa1.setLayout(null);
                pa1.setBackground(azul);
                pa1.setBounds(0, 0, 280, 750);
                
                Color corb=new Color(23,236,214);
                
                JLabel im=new JLabel();
                im.setIcon(new ImageIcon("carrinh.jpg"));
                im.setBounds(0, -55, 300, 300);
                
                pa1.add(im);
                JButton bo1=new JButton();
                bo1.setText("Inicio");
                bo1.setHorizontalAlignment(JButton.LEFT);
                bo1.setIcon(new ImageIcon("inicio.jpg"));
                bo1.setFocusable(false);
                bo1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                bo1.setBounds(0, 191, 280, 50);
                bo1.setBackground(azul);
                pa1.add(bo1);
                
                JButton bo2=new JButton();
                bo2.setText("Cadastrar Produtos");
                bo2.setHorizontalAlignment(JButton.LEFT);
                bo2.setIcon(new ImageIcon("prod.png"));
                bo2.setFocusable(false);
                bo2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                bo2.setBounds(0, 241, 280, 50);
                bo2.setBackground(azul);
                pa1.add(bo2);
                
                JButton bo3=new JButton();
                bo3.setText("Cadastrar Cliente");
                bo3.setHorizontalAlignment(JButton.LEFT);
                bo3.setIcon(new ImageIcon("cliente.jpg"));
                bo3.setFocusable(false);
                bo3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                bo3.setBounds(0, 291, 280, 50);
                bo3.setBackground(azul);
                pa1.add(bo3);
                
                JButton bo4=new JButton();
                bo4.setText("Fluxo de Caixa");
                bo4.setHorizontalAlignment(JButton.LEFT);
                bo4.setIcon(new ImageIcon("vend.jpg"));
                bo4.setFocusable(false);
                bo4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                bo4.setBounds(0, 341, 280, 50);
                bo4.setBackground(azul);
                pa1.add(bo4);
                
                JButton bo5=new JButton();
                bo5.setText("Ajuda | Suporte");
                bo5.setHorizontalAlignment(JButton.LEFT);
                bo5.setIcon(new ImageIcon("ajuda.png"));
                bo5.setFocusable(false);
                bo5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                bo5.setBounds(0, 700, 280, 50);
                bo5.setBackground(azul);
                pa1.add(bo5);
                
                
                JPanel pa2=new JPanel();
                pa2.setLayout(null);
                pa2.setBackground(Color.pink);
                pa2.setBounds(280, 0, 1200, 100);
                
                JButton bu1=new JButton();
                bu1.setText("Fornecedores");
                bu1.setBorder(null);
                bu1.setBackground(Color.pink);
                bu1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                bu1.setIcon(new ImageIcon("fornecedor.png"));
                bu1.setHorizontalTextPosition(JButton.CENTER);
                bu1.setVerticalTextPosition(JButton.BOTTOM);
                bu1.setBounds(10, 0, 210, 100);
                bu1.setFocusable(false);
                 pa2.add(bu1);
                 
                 JButton bu2=new JButton();
                bu2.setText("Vendas");
                bu2.setBorder(null);
                bu2.setBackground(Color.pink);
                 bu2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                  bu2.setIcon(new ImageIcon("vendas.png"));
                bu2.setHorizontalTextPosition(JButton.CENTER);
                bu2.setVerticalTextPosition(JButton.BOTTOM);
                bu2.setBounds(220, 0, 210, 100);
                bu2.setFocusable(false);
                 pa2.add(bu2);
                 
                 JButton bu3=new JButton();
                bu3.setText("Estoque");
                bu3.setBorder(null);
                bu3.setBackground(Color.pink);
                 bu3.setFont(new Font("Times New Roman", Font.BOLD, 20));
                 bu3.setIcon(new ImageIcon("estoque.png"));
                 bu3.setHorizontalTextPosition(JButton.CENTER);
                bu3.setVerticalTextPosition(JButton.BOTTOM);
                bu3.setBounds(430, 0, 210, 100);
                bu3.setFocusable(false);
                 pa2.add(bu3);
                 

                 
                JButton bu5=new JButton();
                bu5.setText("Gerente");
                bu5.setBorder(null);
                bu5.setBackground(Color.pink);
                 bu5.setFont(new Font("Times New Roman", Font.BOLD, 20));
                  bu5.setIcon(new ImageIcon("perfil.png"));
                  bu5.setHorizontalTextPosition(JButton.CENTER);
                bu5.setVerticalTextPosition(JButton.BOTTOM);
                bu5.setBounds(650, 0, 210, 100);
                bu5.setFocusable(false);
                pa2.add(bu5);
                
                
                JPanel pa10=new JPanel();
                pa10.setLayout(null);
                pa10.setBackground(Color.cyan);
                pa10.setBounds(280, 100, 1200, 750);
                
                JLabel ge=new JLabel();
                ge.setText("Gerente da Ferragem");
                ge.setBounds(20, 20, 200, 40);
                ge.setFont(new Font("Times New Roman", Font.BOLD,20));
                pa10.add(ge);
                
                JTextArea r=new JTextArea();
                r.setBounds(20, 60, 1023, 550);
                r.setFont(new Font("Times New Roman", Font.PLAIN,40));
                r.setBackground(Color.white);
                r.setEditable(false);
                GerenteDAO proo=new GerenteDAO();
                r.setText(""+proo.todos().get(0));
                pa10.add(r);
                
                
               
                JButton bu6=new JButton();
                bu6.setText("LogOut");
                bu6.setBorder(null);
                bu6.setBackground(Color.pink);
                 bu6.setFont(new Font("Times New Roman", Font.BOLD, 20));
                 bu6.setIcon(new ImageIcon("out.jpg"));
                 bu6.setHorizontalTextPosition(JButton.CENTER);
                bu6.setVerticalTextPosition(JButton.BOTTOM);
                bu6.setBounds(880, 0, 210, 100);
                bu6.setFocusable(false);
                pa2.add(bu6);
                bu6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                         JFrame jan=new JFrame();
                        jan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jan.setSize(298,140);
                        Container c=jan.getContentPane();
                        c.setLayout(new GridLayout(2, 1));
                        c.setBackground(Color.BLUE);
                        JPanel p1=new JPanel();
                        p1.setLayout(new GridLayout(1, 1));
                        JPanel p2=new JPanel();
                        p2.setLayout(new FlowLayout());
                        JLabel sair=new JLabel("   Tem Certeza de que Deseja Sair");
                        sair.setForeground(Color.BLACK);
                        JButton b1=new JButton("SIM");
                        b1.setFocusable(false);
                        b1.setBackground(Color.cyan);
                        JButton b2=new JButton("NAO");
                        b2.setBackground(Color.cyan);
                        b2.setFocusable(false);
                        b1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                jan.setVisible(false);
                                janela2.setVisible(false);
                         
                            }
                        });
                         b2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                jan.setVisible(false);
                            }
                        });
                        p1.add(sair);
                        p2.add(b1);
                        p2.add(b2);
                        c.add(p1);
                        c.add(p2);
                        jan.setVisible(true);
                        jan.setLocationRelativeTo(null);
                    }
                });
                    
                
                JPanel pa3=new JPanel();
                pa3.setLayout(null);
                pa3.setBackground(Color.cyan);
                pa3.setBounds(280, 100, 1200, 750);
                
                JLabel noti=new JLabel();
                noti.setText("NOTIFICACOES");
                noti.setBackground(Color.pink);
                noti.setOpaque(true);
                noti.setForeground(Color.white);
                noti.setFont(new Font("Times New Roman", Font.BOLD, 25));
                noti.setBounds(20, 40, 300, 40);
                noti.setHorizontalAlignment(JButton.CENTER);
                pa3.add(noti);
                
                JTextArea not=new JTextArea();
                not.setBounds(20, 80, 300, 200);
                not.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pa3.add(not);
                
                
                JLabel exp=new JLabel();
                exp.setText("PRODUTOS EXPIRADOS");
                exp.setBackground(Color.pink);
                exp.setOpaque(true);
                exp.setForeground(Color.white);
                exp.setFont(new Font("Times New Roman", Font.BOLD, 25));
                exp.setBounds(350, 40, 300, 40);
                exp.setHorizontalAlignment(JButton.CENTER);
                pa3.add(exp);
                
                JTextArea ex=new JTextArea();
                ex.setBounds(350, 80, 300, 200);
                ex.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pa3.add(ex);
                
                JLabel sto=new JLabel();
                sto.setText("ESTOQUE INDISPONIVEL");
                sto.setBackground(Color.pink);
                sto.setOpaque(true);
                sto.setForeground(Color.white);
                sto.setFont(new Font("Times New Roman", Font.BOLD, 25));
                sto.setBounds(680, 40, 350, 40);
                sto.setHorizontalAlignment(JButton.CENTER);
                pa3.add(sto);
                
                JTextArea st=new JTextArea();
                st.setBounds(680, 80, 350, 200);
                st.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pa3.add(st);
                
                JLabel aba=new JLabel();
                aba.setText("ABASTECIMENTOS DO DIA");
                aba.setBackground(Color.pink);
                aba.setOpaque(true);
                aba.setForeground(Color.white);
                aba.setFont(new Font("Times New Roman", Font.BOLD, 25));
                aba.setBounds(680, 320, 350, 40);
                aba.setHorizontalAlignment(JButton.CENTER);
                pa3.add(aba);
                
                JTextArea ab=new JTextArea();
                ab.setBounds(680, 360, 350, 200);
                ab.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pa3.add(ab);
                
                JLabel mai=new JLabel();
                mai.setText("MAIOR VENDA");
                mai.setBackground(Color.pink);
                mai.setOpaque(true);
                mai.setForeground(Color.white);
                mai.setFont(new Font("Times New Roman", Font.BOLD, 25));
                mai.setBounds(350, 320, 300, 40);
                mai.setHorizontalAlignment(JButton.CENTER);
                pa3.add(mai);
                
                JTextArea ma=new JTextArea();
                ma.setBounds(350, 360, 300, 200);
                ma.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pa3.add(ma);
                
                JLabel atra=new JLabel();
                atra.setText("ESTOQUE ATRASADO");
                atra.setBackground(Color.pink);
                atra.setOpaque(true);
                atra.setForeground(Color.white);
                atra.setFont(new Font("Times New Roman", Font.BOLD, 25));
                atra.setBounds(20, 320, 300, 40);
                atra.setHorizontalAlignment(JButton.CENTER);
                pa3.add(atra);
                
                JTextArea atr=new JTextArea();
                atr.setBounds(20, 360, 300, 200);
                atr.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pa3.add(atr);
                
                
                JPanel pa4=new JPanel();
                pa4.setLayout(null);
                pa4.setBackground(Color.cyan);
                pa4.setBounds(280, 100, 1200, 750);
                
                JLabel novo=new JLabel();
                novo.setText("Novo Cliente");
                novo.setFont(new Font("Times New Roman", Font.BOLD, 40));
                novo.setBackground(Color.gray);
                novo.setOpaque(true);
                novo.setBounds(0, 0, 1200, 50);
                pa4.add(novo);
                
                JLabel nome=new JLabel();
                nome.setText("Nome");
                nome.setFont(new Font("Times New Roman", Font.BOLD, 20));
                nome.setBounds(20, 60, 1000, 40);
                pa4.add(nome);
                
                JTextField nom=new JTextField();
                nom.setBounds(20, 100, 1050, 30);
                nom.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                nom.setBackground(Color.WHITE);
                pa4.add(nom);
                
                JLabel codigo=new JLabel();
                codigo.setText("Codigo");
                codigo.setFont(new Font("Times New Roman", Font.BOLD, 20));
                codigo.setBounds(20, 150, 330, 40);
                pa4.add(codigo);
                
                JTextField cod=new JTextField();
                cod.setBounds(20, 190, 330, 30);
                cod.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                cod.setBackground(Color.WHITE);
                pa4.add(cod);
                
                JLabel tel1=new JLabel();
                tel1.setText("Telefone 1");
                tel1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                tel1.setBounds(380, 150, 330, 40);
                pa4.add(tel1);
                
                JTextField te1=new JTextField();
                te1.setBounds(380, 190, 330, 30);
                te1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                te1.setBackground(Color.WHITE);
                pa4.add(te1);
                
                JLabel tel2=new JLabel();
                tel2.setText("Telefone 2");
                tel2.setFont(new Font("Times New Roman", Font.BOLD, 20));
                tel2.setBounds(740, 150, 330, 40);
                pa4.add(tel2);
                
                JTextField te2=new JTextField();
                te2.setBounds(740, 190, 330, 30);
                te2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                te2.setBackground(Color.WHITE);
                pa4.add(te2);
                
                
                JLabel cidade=new JLabel();
                cidade.setText("Cidade");
                cidade.setFont(new Font("Times New Roman", Font.BOLD, 20));
                cidade.setBounds(20, 230, 330, 40);
                pa4.add(cidade);
                
                JTextField cidad=new JTextField();
                cidad.setBounds(20, 270, 330, 30);
                cidad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                cidad.setBackground(Color.WHITE);
                pa4.add(cidad);
                
                 JLabel ave=new JLabel();
                ave.setText("Avenida");
                ave.setFont(new Font("Times New Roman", Font.BOLD, 20));
                ave.setBounds(380, 230, 330, 40);
                pa4.add(ave);
                
                JTextField av=new JTextField();
                av.setBounds(380, 270, 330, 30);
                av.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                av.setBackground(Color.WHITE);
                pa4.add(av);
                
                JLabel rua=new JLabel();
                rua.setText("Rua");
                rua.setFont(new Font("Times New Roman", Font.BOLD, 20));
                rua.setBounds(740, 230, 330, 40);
                pa4.add(rua);
                
                JTextField ru=new JTextField();
                ru.setBounds(740, 270, 330, 30);
                ru.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                ru.setBackground(Color.WHITE);
                pa4.add(ru);
           
                 JLabel desc=new JLabel();
                desc.setText("Descricao");
                desc.setFont(new Font("Times New Roman", Font.BOLD, 20));
                desc.setBounds(20, 310, 1000, 40);
                pa4.add(desc);
                
                JTextArea des=new JTextArea();
                des.setBounds(20, 350, 1050, 170);
                des.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                des.setBackground(Color.WHITE);
                pa4.add(des);
                
                JButton cancelar=new JButton();
                cancelar.setText("Cancelar");
                cancelar.setBackground(Color.red);
                cancelar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                cancelar.setBounds(690, 550, 180, 60);
                cancelar.setFocusable(false);
                pa4.add(cancelar);
                
                JButton salvar=new JButton();
                salvar.setText("salvar");
                salvar.setBackground(Color.GREEN);
                salvar.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                salvar.setBounds(890, 550, 180, 60);
                salvar.setFocusable(false);
                pa4.add(salvar);
                
                salvar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        Cliente clie=new Cliente();
                        clie.setNome(nom.getText());
                        clie.setCodigo(Integer.parseInt(cod.getText()));
                        clie.setTel1(te1.getText());
                        clie.setTel2(te2.getText());
                        clie.setCidade(cidad.getText());
                        clie.setAvenida(av.getText());
                        clie.setRua(ru.getText());
                        clie.setDescricao(des.getText());
                        ClienteDAO cli=new ClienteDAO();
                        cli.inserir(clie);
                        JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso!", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                         nom.setText(null);
                        cod.setText(null);
                        te1.setText(null);
                        te2.setText(null);
                        cidad.setText(null);
                        av.setText(null);
                        ru.setText(null);
                        des.setText(null);
                    }
                });
                cancelar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                         JOptionPane.showMessageDialog(null, "Cadastro cancelado!", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                        nom.setText(null);
                        cod.setText(null);
                        te1.setText(null);
                        te2.setText(null);
                        cidad.setText(null);
                        av.setText(null);
                        ru.setText(null);
                        des.setText(null);
                       JOptionPane.showMessageDialog(null, "Cadastro cancelado!", "Titulo", JOptionPane.INFORMATION_MESSAGE);

                       
                    }
                });
                
                
                
                //Painl 5
                
                
                JPanel pa5=new JPanel();
                pa5.setLayout(null);
                pa5.setBackground(Color.CYAN);
                pa5.setBounds(280, 100, 1200, 750);
                
                JLabel novo1=new JLabel();
                novo1.setText("Novo Produto");
                novo1.setFont(new Font("Times New Roman", Font.BOLD, 40));
                novo1.setBackground(Color.gray);
                novo1.setForeground(Color.cyan);
                novo1.setOpaque(true);
                novo1.setBounds(0, 0, 1200, 50);
                pa5.add(novo1);
                
                JLabel nome1=new JLabel();
                nome1.setText("Nome do Produto");
                nome1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                nome1.setBounds(20, 60, 1000, 40);
                pa5.add(nome1);
                
                JTextField nom1=new JTextField();
                nom1.setBounds(20, 100, 1050, 30);
                nom1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                nom1.setBackground(Color.WHITE);
                pa5.add(nom1);
                
                JLabel codigo1=new JLabel();
                codigo1.setText("Codigo");
                codigo1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                codigo1.setBounds(20, 150, 330, 40);
                pa5.add(codigo1);
                
                JTextField cod1=new JTextField();
                cod1.setBounds(20, 190, 330, 30);
                cod1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                cod1.setBackground(Color.WHITE);
                pa5.add(cod1);
                
                JLabel pre=new JLabel();
                pre.setText("Preco Unitaio");
                pre.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pre.setBounds(380, 150, 330, 40);
                pa5.add(pre);
                
                JTextField pr=new JTextField();
                pr.setBounds(380, 190, 330, 30);
                pr.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                pr.setBackground(Color.WHITE);
                pa5.add(pr);
                
                JLabel pre1=new JLabel();
                pre1.setText("Preco de Compra");
                pre1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                pre1.setBounds(740, 150, 330, 40);
                pa5.add(pre1);
                
                JTextField pr1=new JTextField();
                pr1.setBounds(740, 190, 330, 30);
                pr1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                pr1.setBackground(Color.WHITE);
                pa5.add(pr1);
                
                
                JLabel qua=new JLabel();
                qua.setText("Quantidade");
                qua.setFont(new Font("Times New Roman", Font.BOLD, 20));
                qua.setBounds(20, 230, 330, 40);
                pa5.add(qua);
                
                JTextField qu=new JTextField();
                qu.setBounds(20, 270, 330, 30);
                qu.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                qu.setBackground(Color.WHITE);
                pa5.add(qu);
                
                 JLabel vali=new JLabel();
                vali.setText("Validade");
                vali.setFont(new Font("Times New Roman", Font.BOLD, 20));
                vali.setBounds(380, 230, 330, 40);
                pa5.add(vali);
                
                JTextField val=new JTextField();
                val.setBounds(380, 270, 330, 30);
                val.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                val.setBackground(Color.WHITE);
                pa5.add(val);
                
                 JLabel descr=new JLabel();
                descr.setText("Descricao do Produto");
                descr.setFont(new Font("Times New Roman", Font.BOLD, 20));
                descr.setBounds(20, 310, 1000, 40);
                pa5.add(descr);
                
                JTextArea de=new JTextArea();
                de.setBounds(20, 350, 1050, 170);
                de.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                de.setBackground(Color.WHITE);
                pa5.add(de);
                
                JButton cancela=new JButton();
                cancela.setText("Cancelar");
                cancela.setBackground(Color.red);
                cancela.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                cancela.setBounds(690, 550, 180, 60);
                cancela.setFocusable(false);
                pa5.add(cancela);
                
                JButton salva=new JButton();
                salva.setText("salvar");
                salva.setBackground(Color.GREEN);
                salva.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                salva.setBounds(890, 550, 180, 60);
                salva.setFocusable(false);
                pa5.add(salva);
                
                
                ///Evento para salvar um produto
                salva.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                     ProdutoDAO prodDAO=new ProdutoDAO();
                     Produto prod=new Produto();
                     prod.setCodigo(Integer.parseInt(cod1.getText()));
                     prod.setNome(nom1.getText());
                     prod.setPrecoUnit(Float.parseFloat(pr.getText()));
                     prod.setPrecoCompra(Float.parseFloat(pr1.getText()));
                     prod.setQuant(Integer.parseInt(qu.getText()));
                     prod.setValidade(Date.valueOf(val.getText()));
                     prod.setDescricao(de.getText());
                     
                     prodDAO.inserir(prod);
                    JOptionPane.showMessageDialog(null, "Produto Salvo com Sucesso!", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                     cod1.setText("");
                        nom1.setText("");
                        pr.setText("");
                        pr1.setText("");
                        qu.setText("");
                        val.setText("");
                        de.setText("");
                    }
                });
                cancela.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       JOptionPane.showMessageDialog(null, "Cadastro Cancelado!", "Titulo", JOptionPane.INFORMATION_MESSAGE);

                        cod1.setText("");
                        nom1.setText("");
                        pr.setText("");
                        pr1.setText("");
                        qu.setText("");
                        val.setText("");
                        de.setText("");
                    }
                });
                
               
                
                // Painel 6
                JPanel pa6=new JPanel();
                pa6.setLayout(null);
                pa6.setBackground(Color.cyan);
                pa6.setBounds(280, 100, 1200, 750);
                
                JLabel pesq=new JLabel();
                pesq.setText("Pesquisar uma Venda");
                pesq.setFont(new Font("Times New Roman", Font.BOLD, 40));
                pesq.setBackground(Color.gray);
                pesq.setForeground(Color.white);
                pesq.setOpaque(true);
                pesq.setBounds(0, 0, 1200, 50);
                pa6.add(pesq);

                
                
                JTextField pda=new JTextField();
                pda.setBounds(20, 100, 500, 40);
                pda.setText("");
                pda.setFont(new Font("Times New Roman", Font.ITALIC, 20));
                pa6.add(pda);
                
               
                JLabel venda=new JLabel();
                venda.setText("Vendas Pesquisadas");
                venda.setBounds(20, 160, 200, 40);
                venda.setFont(new Font("Times New Roman", Font.BOLD,20));
                pa6.add(venda);
                
                JTextArea result=new JTextArea();
                result.setBounds(20, 200, 1023, 425);
                result.setFont(new Font("Times New Roman", Font.PLAIN,30));
                result.setBackground(Color.white);
                pa6.add(result);
                 JButton pdat=new JButton();
                pdat.setFocusable(false);
                pdat.setText("Presquisar um produto Vendido");
                pdat.setBackground(Color.pink);
                pdat.setOpaque(true);
                pdat.setForeground(Color.white);
                pdat.setFont(new Font("Times New Roman", Font.BOLD, 19));
                pdat.setBounds(20, 60, 500, 40);
                pdat.setHorizontalAlignment(JButton.CENTER);
                pa6.add(pdat);
                result.setEditable(false);
                pdat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       
                        VendaDAO v=new VendaDAO();
                        
                        result.setText(v.todosP(pda.getText()));
                      if(result.getText().equalsIgnoreCase("")){
                        JOptionPane.showMessageDialog(null, "Nenhuma venda desse produto!", "Titulo", JOptionPane.INFORMATION_MESSAGE);

                      }
                    }
                });
                bo1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        pa3.setVisible(true);
                        pa4.setVisible(false);
                        pa5.setVisible(false);
                        pa6.setVisible(false);
                        
                    }
                });
                
                 bo2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        pa3.setVisible(false);
                        pa4.setVisible(false);
                        pa5.setVisible(true);
                        pa6.setVisible(false);
                    }
                });
                
                  bo3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        pa3.setVisible(false);
                        pa4.setVisible(true);
                        pa5.setVisible(false);
                        pa6.setVisible(false);
                    }
                });
                
                   bo4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        pa3.setVisible(false);
                        pa4.setVisible(false);
                        pa5.setVisible(false);
                        pa6.setVisible(true);
                    }
                });
                   
                   
               JPanel pa7=new JPanel();
                pa7.setLayout(null);
                pa7.setBackground(Color.cyan);
                pa7.setBounds(280, 100, 1200, 750);
                
                JLabel fon=new JLabel();
                fon.setText("Fornecedores");
                fon.setBounds(20, 20, 200, 40);
                fon.setFont(new Font("Times New Roman", Font.BOLD,20));
                pa7.add(fon);
                
                JTextArea resultado=new JTextArea();
                resultado.setBounds(20, 60, 1023, 550);
                resultado.setFont(new Font("Times New Roman", Font.PLAIN,17));
                resultado.setBackground(Color.white);
                resultado.setEditable(false);
                FornecedorDAO forne=new FornecedorDAO();
                resultado.setText(""+forne.todos());
                pa7.add(resultado);
                bu1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                         pa3.setVisible(false);
                        pa4.setVisible(false);
                        pa5.setVisible(false);
                        pa6.setVisible(false);
                        pa7.setVisible(true);
                    }
                });
                
                 JPanel pa8=new JPanel();
                pa8.setLayout(null);
                pa8.setBackground(Color.cyan);
                pa8.setBounds(280, 100, 1200, 750);
                
                JLabel vend=new JLabel();
                vend.setText("Vendas");
                vend.setBounds(20, 20, 200, 40);
                vend.setFont(new Font("Times New Roman", Font.BOLD,20));
                pa8.add(vend);
                
                JTextArea resu=new JTextArea();
                resu.setBounds(20, 60, 1023, 550);
                resu.setFont(new Font("Times New Roman", Font.PLAIN,17));
                resu.setBackground(Color.white);
                resu.setEditable(false);
                VendaDAO ven=new VendaDAO();
                resu.setText(""+ven.todos());
                pa8.add(resu);
                bu2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                         pa3.setVisible(false);
                        pa4.setVisible(false);
                        pa5.setVisible(false);
                        pa6.setVisible(false);
                        pa7.setVisible(false);
                        pa8.setVisible(true);
                    }
                });
                JPanel pa9=new JPanel();
                pa9.setLayout(null);
                pa9.setBackground(Color.cyan);
                pa9.setBounds(280, 100, 1200, 750);
                
                JLabel stock=new JLabel();
                stock.setText("Produtos Disponiveis");
                stock.setBounds(20, 20, 200, 40);
                stock.setFont(new Font("Times New Roman", Font.BOLD,20));
                pa9.add(stock);
                
                JTextArea res=new JTextArea();
                res.setBounds(20, 60, 1023, 550);
                res.setFont(new Font("Times New Roman", Font.PLAIN,17));
                res.setBackground(Color.white);
                res.setEditable(false);
                ProdutoDAO pro=new ProdutoDAO();
                //res.setText(""+pro.todos());
                for(int i=0; i<pro.todos().size(); i++){
                  res.setText(res.getText()+pro.todos().get(i).toString()+"\n");
                }
                pa9.add(res);
                bu3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                         pa3.setVisible(false);
                        pa4.setVisible(false);
                        pa5.setVisible(false);
                        pa6.setVisible(false);
                        pa7.setVisible(false);
                        pa8.setVisible(false);
                        pa9.setVisible(true);
                    }
                });
                 bu5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        pa10.setVisible(true);
                          pa3.setVisible(false);
                        pa4.setVisible(false);
                        pa5.setVisible(false);
                        pa6.setVisible(false);
                        pa7.setVisible(false);
                        pa8.setVisible(false);
                        pa9.setVisible(false);
                        
                    }
                });
                
                c2.add(pa1);
                c2.add(pa2);
                c2.add(pa4);
                c2.add(pa3);
                c2.add(pa5);
                c2.add(pa6);
                c2.add(pa7);
                c2.add(pa8);
                c2.add(pa9);
                c2.add(pa10);
                janela2.setVisible(true);
           /* }else{
                    JOptionPane.showMessageDialog(null, "Dados Invalidos", "Titulo", JOptionPane.ERROR_MESSAGE);
            }
            }
            */
            }
        });
        
        
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 FuncionarioDAO funci=new FuncionarioDAO(); 
                /* String nome="", codigo="";
            for(int i=0; i<funci.todos().size();i++){
               if(funci.todos().get(i).getNome().equalsIgnoreCase(txt1.getText())  && funci.todos().get(i).getCodigo().equalsIgnoreCase(txt2.getText())){
                   nome=funci.todos().get(i).getNome();
                   codigo=funci.todos().get(i).getCodigo();
                    
                    
               }
            }
             if(txt1.getText().equalsIgnoreCase("") || txt2.getText().equalsIgnoreCase("")){
                 JOptionPane.showMessageDialog(null, "Dados Invalidos", "Titulo", JOptionPane.ERROR_MESSAGE);

            }
                           
             else if(nome.equals(txt1.getText())  && codigo.equals(txt2.getText())){
 */
                JFrame janela1=new JFrame();
                janela1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                janela1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                janela1.setTitle("Sistema de gestao de vendas da ferragem");
                Container c1=janela1.getContentPane();
                c1.setLayout(null);
                JPanel p1=new JPanel();
                p1.setLayout(null);
                p1.setBounds(0, 0, 1500, 95);
                p1.setBackground(azul);
                
                JLabel lbl7=new JLabel();
                lbl7.setIcon(new ImageIcon("net.jpg"));
                lbl7.setBounds(0, -3, 100, 100);
                JLabel lbl8=new JLabel("Sistema de Gerenciamento");
                lbl8.setFont(new Font("ALGERIAN", Font.BOLD,40));
                lbl8.setBounds(100, 0, 800, 50);
                JLabel lbl9=new JLabel("Sistema de Gerenciamento de Vendas da Ferragem MM Langa");
                lbl9.setFont(new Font("Times New Roman", Font.BOLD,18));
                Color azulEscuro=new Color(0, 0, 200);
                Color azulSuperescuro=new Color(24,28,109);
                lbl9.setForeground(azulEscuro);
                
                JLabel lbl10=new JLabel("     CAIXA 01");
                lbl10.setBounds(900, -3, 800, 100);
                lbl10.setBackground(azulSuperescuro);
                lbl10.setForeground(azul);
                lbl10.setFont(new Font("Times New Roman", Font.BOLD,60));
                lbl10.setOpaque(true);
                
                 Color verde=new Color(100, 254, 200);
                 
                JPanel pp2=new JPanel();
                pp2.setLayout(null);
                pp2.setBounds(0, 100, 400, 650);
                pp2.setBackground(azul);
                JLabel lbl11=new JLabel();
                lbl11.setIcon(new ImageIcon("carrinho.jpg"));
                lbl11.setBounds(0, -170, 400, 600);
                pp2.add(lbl11);
                
                JTextArea txt2=new JTextArea();
                txt2.setBackground(verde);
                txt2.setText("");
                txt2.setBounds(0, 260, 400, 300);
                txt2.setEditable(false);
                pp2.add(txt2);
               
                
                JLabel lb1=new JLabel("VALOR TOTAL");
                
                lb1.setForeground(azulSuperescuro);
                lb1.setBounds(0, 578, 250, 40);
                lb1.setFont(new Font("Times New Roman", Font.BOLD,30));
                pp2.add(lb1);
                
                JTextField txt3=new JTextField();
                txt3.setBounds(235, 570, 150, 60);
                txt3.setText("0.0");
                txt3.setHorizontalAlignment(JTextField.RIGHT);
                txt3.setBackground(Color.GREEN);
                txt3.setFont(new Font("Times New Roman", Font.BOLD,40));
                txt3.setEditable(false);
                pp2.add(txt3);                
               
                lbl9.setBounds(110, 30, 800, 50);
                
                
                JPanel pp3=new JPanel();
                pp3.setLayout(null);
                pp3.setBounds(410, 100, 960, 40);
                pp3.setBackground(azul);
                ClienteDAO cli=new ClienteDAO();
                JLabel data=new JLabel();
                data.setText("Data e Hora de Acesso: "+cli.data());
                data.setBounds(4, 3, 600, 40);
                data.setFont(new Font("Times New Roman", Font.BOLD,15));
                pp3.add(data);
                
                JLabel funcionario=new JLabel();
                funcionario.setText("  Funcionario no Caixa: "+txt1.getText());
                funcionario.setBounds(600, 0, 400, 40);
                funcionario.setFont(new Font("Times New Roman", Font.BOLD,17));
                funcionario.setForeground(azul);
                funcionario.setBackground(azulSuperescuro);
                funcionario.setOpaque(true);
                pp3.add(funcionario);
                
                
                JPanel pp4=new JPanel();
                pp4.setLayout(null);
                pp4.setBounds(410, 145, 960, 90);
                pp4.setBackground(azul);
                
                JLabel branco=new JLabel();
                branco.setBounds(700, 0, 500, 90);
                branco.setBackground(azulSuperescuro);
                branco.setOpaque(true);
                pp4.add(branco);
                
                JLabel produto=new JLabel();
                produto.setText("                   Produto");
                produto.setHorizontalTextPosition(JLabel.CENTER);
                produto.setVerticalTextPosition(JLabel.CENTER);
                produto.setFont(new Font("Times New Roman", Font.BOLD,40));
                produto.setForeground(Color.white);
                produto.setBounds(7, 7, 946, 76);
                produto.setBackground(azulSuperescuro);
                produto.setOpaque(true);
                pp4.add(produto);
                
                
                JPanel pp5=new JPanel();
                pp5.setLayout(null);
                pp5.setBounds(410, 235, 960, 425);
                pp5.setBackground(azul);
             
                
                
               
                
                JTextField a1=new JTextField();
                a1.setBounds(160, 10, 180, 80);
                a1.setText("");
                a1.setFont(new Font("Times New Roman", Font.BOLD,60));
                a1.setHorizontalAlignment(JTextField.RIGHT);
                a1.setForeground(azulSuperescuro);
                a1.setBorder(null);
                a1.setBackground(Color.white);
                a1.setOpaque(true);
                pp5.add(a1);
                
                JTextField a2=new JTextField();
                a2.setBounds(160, 100, 180, 80);
                a2.setText("");
                a2.setFont(new Font("Times New Roman", Font.BOLD,60));
                a2.setHorizontalAlignment(JTextField.RIGHT);
                a2.setForeground(azulSuperescuro);
                a2.setBackground(Color.WHITE);
                a2.setBorder(null);
                a2.setOpaque(true);
                pp5.add(a2);
                
                 JTextField a3=new JTextField();
                a3.setBounds(160, 190, 180, 80);
                a3.setText("");
                a3.setFont(new Font("Times New Roman", Font.BOLD,60));
                a3.setHorizontalAlignment(JTextField.RIGHT);
                a3.setForeground(azulSuperescuro);
                a3.setBackground(Color.WHITE);
                a3.setBorder(null);
                a3.setOpaque(true);
                a3.setEditable(false);
                pp5.add(a3);
                
                 JTextField a4=new JTextField();
                a4.setBounds(160, 280, 180, 80);
                a4.setText("");
                a4.setFont(new Font("Times New Roman", Font.BOLD,60));
                a4.setHorizontalAlignment(JTextField.RIGHT);
                a4.setForeground(azulSuperescuro);
                a4.setBackground(Color.WHITE);
                a4.setBorder(null);
                a4.setOpaque(true);
                a4.setEditable(false);
                pp5.add(a4);
                
                JLabel l1=new JLabel("Codigo",SwingConstants.LEFT);
                l1.setBounds(10, 10, 300, 80);
                l1.setVerticalAlignment(SwingConstants.TOP);
                l1.setFont(new Font("Times New Roman", Font.BOLD,22));
                l1.setHorizontalTextPosition(JLabel.CENTER);
                l1.setVerticalTextPosition(JLabel.CENTER);
                l1.setBackground(Color.white);
                l1.setOpaque(true);
                pp5.add(l1);
                
                 JLabel l2=new JLabel("Quantidade",SwingConstants.LEFT);
                l2.setBounds(10, 100, 300, 80);
                l2.setVerticalAlignment(SwingConstants.TOP);
                l2.setFont(new Font("Times New Roman", Font.BOLD,22));
                l2.setBackground(Color.white);
                l2.setOpaque(true);
                pp5.add(l2);
                
                JLabel l3=new JLabel("Preco Unitario",SwingConstants.LEFT);
                l3.setBounds(10, 190, 300, 80);
                l3.setVerticalAlignment(SwingConstants.TOP);
                l3.setFont(new Font("Times New Roman", Font.BOLD,22));
                l3.setBackground(Color.white);
                l3.setOpaque(true);
                pp5.add(l3);
                
                JLabel l4=new JLabel("Subtotal",SwingConstants.LEFT);
                l4.setBounds(10, 280, 300, 80);
                l4.setVerticalAlignment(SwingConstants.TOP);
                l4.setFont(new Font("Times New Roman", Font.BOLD,22));
                l4.setBackground(Color.white);
                l4.setOpaque(true);
                pp5.add(l4);
                
                JLabel desc=new JLabel();
                desc.setText("Descontos");
                desc.setBounds(370, 10, 100, 20);
                desc.setFont(new Font("Times New Roman", Font.BOLD,22));
                pp5.add(desc);
                
                
                JTextField de=new JTextField();
                de.setBounds(370, 45, 250, 40);
                de.setBackground(Color.WHITE);
                de.setText("0");
                de.setFont(new Font("Times New Roman", Font.ITALIC,15));
                pp5.add(de);
                
                 JTextField deVa=new JTextField();
                deVa.setBounds(650, 45, 250, 40);
                deVa.setBackground(Color.WHITE);
                deVa.setText("0");
                deVa.setFont(new Font("Times New Roman", Font.ITALIC,15));
                deVa.setEditable(false);
                pp5.add(deVa);
                
                JTextField total=new JTextField();
                total.setBounds(370, 100, 530, 260);
                total.setText("0.00");
                total.setForeground(Color.RED);
                total.setBackground(Color.WHITE);
                total.setHorizontalAlignment(JTextField.CENTER);
                total.setFont(new Font("Times New Roman", Font.BOLD,120));
                total.setEditable(false);
                pp5.add(total);
                
                 JLabel menu=new JLabel();
                menu.setText("       Menu de Navegacao");
                menu.setBackground(azulSuperescuro);
                menu.setForeground(azul);
                menu.setHorizontalTextPosition(JLabel.CENTER);
                menu.setOpaque(true);
                menu.setFont(new Font("Times New Roman", Font.BOLD,25));
                menu.setBounds(100, 390, 300, 35);
                pp5.add(menu);
                
                JLabel barra=new JLabel();
                barra.setBackground(Color.BLUE);
                barra.setOpaque(true);
                barra.setBounds(0, 390, 970, 35);
                pp5.add(barra);
                
                
                JPanel pp6=new JPanel();
                pp6.setLayout(null);
                pp6.setBounds(410, 665, 960, 70);
                pp6.setBackground(azul);
                pp6.setOpaque(true);
                
                
                
                
                JButton m1=new JButton("Nova Venda");
                m1.setIcon(new ImageIcon("nova.jpg"));
                m1.setBackground(verde);
                m1.setForeground(azulSuperescuro);
                m1.setBounds(20, 0, 150, 70);
                m1.setFocusable(false);
                pp6.add(m1);
                m1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                         a1.setText("0");
                        a2.setText("0");
                        a3.setText("0.0");
                        a4.setText("0.0");
                        de.setText("0");
                        deVa.setText("0.0");
                        total.setText("0.00");
                   
                }
                });
                
                JButton m2=new JButton("Cancelar Venda");
                m2.setIcon(new ImageIcon("transferir.png"));
                m2.setBackground(verde);
                m2.setForeground(azulSuperescuro);
                m2.setHorizontalTextPosition(JButton.CENTER);
                m2.setVerticalTextPosition(JButton.BOTTOM);
                m2.setBounds(172, 0, 150, 70);
                m2.setFocusable(false);
                pp6.add(m2);
                m2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        a1.setText("0");
                        a2.setText("0");
                        a3.setText("0.0");
                        a4.setText("0.0");
                        de.setText("0");
                        deVa.setText("0.0");
                        total.setText("0.00");
                        JOptionPane.showMessageDialog(null, "Venda Cancelada", "Titulo", JOptionPane.WARNING_MESSAGE);

                    }
                });
                
                JButton m3=new JButton("Pesquisar Produto");
                m3.setIcon(new ImageIcon("procurar.jpg"));
                m3.setBackground(verde);
                m3.setForeground(azulSuperescuro);
                m3.setHorizontalTextPosition(JButton.CENTER);
                m3.setVerticalTextPosition(JButton.BOTTOM);
                m3.setBounds(324, 0, 150, 70);
                m3.setFocusable(false);
                pp6.add(m3);
                
                m3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        ProdutoDAO pr=new ProdutoDAO();
                        Produto pro=new Produto();
                        int i=Integer.parseInt(a1.getText());
                        int f=0;
                        for(int j=0; j< pr.todos().size();j++){
                          if(i==pr.todos().get(j).getCodigo()){
                              pro=pr.PesquisaCodigo(i);
                               float q=Float.parseFloat(a2.getText());
                        float preco=pro.getPrecoUnit();
                        float tot=q*preco;
                        a3.setText(""+preco);
                        a4.setText(""+tot);
                        produto.setText("                               "+pro.getNome());
                        float desconto=Integer.parseInt(de.getText());
                        float valor=(tot*desconto)/100;
                        deVa.setText(""+valor);
                        total.setText(""+(tot-valor));
                          }  else{
                              f=9;
                          }
                        } 
                        if(f==9 && total.getText().equalsIgnoreCase("0.00")){
                                  JOptionPane.showMessageDialog(null, "Produto nao encontrado!", "Titulo", JOptionPane.INFORMATION_MESSAGE);

                        }        
                        
                       
                    }
                });
                
                JButton m4=new JButton("Todos Produtos");
                m4.setIcon(new ImageIcon("todos.jpg"));
                m4.setBackground(verde);
                m4.setForeground(azulSuperescuro);
                m4.setHorizontalTextPosition(JButton.CENTER);
                m4.setVerticalTextPosition(JButton.BOTTOM);
                m4.setBounds(476, 0, 150, 70);
                m4.setFocusable(false);
                pp6.add(m4);
                m4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        ProdutoDAO prod=new ProdutoDAO();
                        String s=prod.todoStringMetade();
                        txt2.setText(s);
                        txt3.setText(""+prod.ValorTotal());
                    }
                });
                
                JButton m5=new JButton("Vender Produto");
                m5.setIcon(new ImageIcon("images.png"));
                m5.setBackground(verde);
                m5.setForeground(azulSuperescuro);
                m5.setHorizontalTextPosition(JButton.CENTER);
                m5.setVerticalTextPosition(JButton.BOTTOM);
                m5.setBounds(628, 0, 150, 70);
                m5.setFocusable(false);
                pp6.add(m5);
                m5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                       Venda venda=new Venda();
                       ProdutoDAO pro=new ProdutoDAO();
                       Produto prod=new Produto();
                       VendaDAO ven=new VendaDAO();
                       String produto="";
                       int qntProd=0;
                       int cod=Integer.parseInt(a1.getText());
                       for(int i=0; i<pro.todos().size();i++){
                           if(pro.todos().get(i).getCodigo()==cod){
                               produto=pro.todos().get(i).getNome();
                               qntProd=pro.todos().get(i).getQuant();
                               prod=pro.todos().get(i);
                           }
                       }
                       venda.setProduto(produto);
                       venda.setQnt(Integer.parseInt(a2.getText()));
                       venda.setData(Date.valueOf(LocalDate.now()));
                       if(qntProd<venda.getQnt() || venda.getQnt()<=0){
                          JOptionPane.showMessageDialog(null, "Quantidade Indisponivel", "Titulo", JOptionPane.ERROR_MESSAGE);
                    
                       } else if(total.getText().equalsIgnoreCase("0.00")){
                         JOptionPane.showMessageDialog(null, "Nao Pode vender este produto!", "Titulo", JOptionPane.INFORMATION_MESSAGE);

                       }else{
                       ven.inserir(venda);
                       JOptionPane.showMessageDialog(null, "Venda Efectuada com Sucesso", "Titulo", JOptionPane.INFORMATION_MESSAGE);
                        prod.setQuant(prod.getQuant()-venda.getQnt());
                        pro.actualizar(prod);
                    }}
                });
                
                 JButton m6=new JButton("Encerar Caixa");
                 m6.setIcon(new ImageIcon("encerrar.jpg"));
                 m6.setBackground(verde);
                m6.setForeground(azulSuperescuro);
                m6.setBounds(780, 0, 150, 70);
                m6.setFocusable(false);
                m6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        JFrame jan=new JFrame();
                        jan.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jan.setSize(298,140);
                        Container c=jan.getContentPane();
                        c.setLayout(new GridLayout(2, 1));
                        c.setBackground(Color.BLUE);
                        JPanel p1=new JPanel();
                        p1.setLayout(new GridLayout(1, 1));
                        JPanel p2=new JPanel();
                        p2.setLayout(new FlowLayout());
                        JLabel sair=new JLabel("   Tem Certeza de que Deseja encerrar o caixa?");
                        sair.setForeground(Color.BLACK);
                        JButton b1=new JButton("SIM");
                        b1.setFocusable(false);
                        b1.setBackground(Color.cyan);
                        JButton b2=new JButton("NAO");
                        b2.setBackground(Color.cyan);
                        b2.setFocusable(false);
                        b1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                jan.setVisible(false);
                                janela1.setVisible(false);
                         
                            }
                        });
                         b2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                jan.setVisible(false);
                            }
                        });
                        p1.add(sair);
                        p2.add(b1);
                        p2.add(b2);
                        c.add(p1);
                        c.add(p2);
                        jan.setVisible(true);
                        jan.setLocationRelativeTo(null);
                    }
                });
                pp6.add(m6);
                
                
                p1.add(lbl10);
                p1.add(lbl8);
                p1.add(lbl9);
                p1.add(lbl7);
                c1.add(pp3);
                c1.add(p1);
                c1.add(pp2);
                c1.add(pp4);
                c1.add(pp5);
                c1.add(pp6);
                janela1.setVisible(true);
               /*   
            }else{
                   JOptionPane.showMessageDialog(null, "Dados Invalidos", "Titulo", JOptionPane.ERROR_MESSAGE);
               }
            }
             */
            }
        });
        
        
        
        
        
        JLabel lbl6=new JLabel("Sistema de Login da Ferragem");
        lbl6.setFont(new Font("Times New Roman", Font.BOLD,19));
        lbl6.setBounds(20, 50, 300, 30);
        p2.add(lbl6);
        
        JLabel lbl7=new JLabel("Insira os Seus Dados");
        lbl7.setFont(new Font("Times New Roman", Font.PLAIN,15));
        lbl7.setBounds(20, 70, 300, 30);
        p2.add(lbl7);
       
        c.add(p1);
        c.add(p2);
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        
        }
    }


