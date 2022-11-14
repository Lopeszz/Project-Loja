/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Init;

import DAO.DAOProduto;
import DAO.DAOProduto;
import DAO.DAOFornecedor;
import Modelos.Produto;
import Modelos.Produto;
import Modelos.Fornecedor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lopes
 */
public class ProdutoInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public ProdutoInternalFrame(javax.swing.JDesktopPane JDesktopPane) {
        initComponents();
        initTable();
        initFont();
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        JDesktopPane.add(this);
        this.Maximizar();
        this.setVisible(true);
        initWinButtonInternal();
    }

    private void setarCamposVazios() {
        txtId.setText("");
        txtNome.setText("");
        txtNome.setText("");
        txtQtn_Estoque.setText("");
        txtPreco.setText("");
        txtDescricao.setText("");
        cbxFornecedor.setSelectedIndex(0);
    }

    private void initTable() {
        table.fixTable(jScrollPane1);
    }

    private void initFont() {
        btnProximo.setFont(Pegandoafont());
        btnAnteriro.setFont(Pegandoafont());
    }

    private void initWinButtonInternal() {
        winButtonInternal.initEvent(ProdutoInternalFrame.this);
    }

    public Font Pegandoafont() {
        try {
            Font montserrat;
            montserrat = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/Source/Fontes/Montserrat-SemiBold.ttf"));
            montserrat = montserrat.deriveFont(Font.PLAIN, 16);
            return montserrat;
        } catch (FontFormatException | IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("deu errado na font");
        }
        return null;
    }

    public void Maximizar() {
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            System.out.println("Problema no maximizar");
        }
    }

    public void CarregarTabela() {
        DAOProduto dao = new DAOProduto();
        List<Produto> Lista = dao.listarProduto();
        DefaultTableModel dados = (DefaultTableModel) table.getModel();
        dados.setNumRows(0); // Limpar a tabela 
        for (Produto obj : Lista) {
            dados.addRow(new Object[]{
                obj.getId_produto(),
                obj.getNome(),
                obj.getDescricao(),
                obj.getPreco(),
                obj.getQtd_estoque(),
                obj.getFornecedor().getNome(),});
        }
    }

    public void Pesquisar() {
        String nome = "%" + txtNomeParaPesquisar.getText() + "%";
        DAOProduto dao = new DAOProduto();

        List<Produto> Lista = dao.buscaProdutoPorNomeTabela(nome);
        DefaultTableModel dados = (DefaultTableModel) table.getModel();
        dados.setNumRows(0);

        for (Produto obj : Lista) {
            dados.addRow(new Object[]{
                obj.getId_produto(),
                obj.getNome(),
                obj.getDescricao(),
                obj.getPreco(),
                obj.getQtd_estoque(),
                obj.getFornecedor().getNome()});
        }
        if (txtNomeParaPesquisar.getText().equals("")) {
            CarregarTabela();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winButtonInternal = new Source.ButtonTitleBar.WinButtonInternal();
        CabecalhodeClienteImg = new javax.swing.JLabel();
        SlideMaterialTabbed = new Source.Classes.Slide.MaterialTabbed();
        Painel_Tabela_Cliente = new javax.swing.JPanel();
        PanelTabela = new javax.swing.JPanel();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        lblControleFuncionarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Source.Classes.Table.Table();
        PanelButoes = new javax.swing.JPanel();
        btnProximo = new Source.Button.ButtonCommun();
        btnAnteriro = new Source.Button.ButtonCommun();
        lblNomeDoPsquisar = new javax.swing.JLabel();
        txtNomeParaPesquisar = new javax.swing.JTextField();
        btnPesquisarTabela = new Source.Button.ButtonCommun();
        Painel_Dados_Cliente = new javax.swing.JPanel();
        Componentes = new javax.swing.JPanel();
        PainelBtn = new javax.swing.JPanel();
        btnPesquisar = new Source.Button.ButtonCommun();
        btnNovo = new Source.Button.ButtonCommun();
        btnSalvar = new Source.Button.ButtonCommun();
        btnAlterar = new Source.Button.ButtonCommun();
        btnRemover = new Source.Button.ButtonCommun();
        btnLimpar = new Source.Button.ButtonCommun();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtn_Estoque = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        cbxFornecedor = new javax.swing.JComboBox();
        CadastrodeDadosdoFuncionario = new javax.swing.JLabel();
        BackgroundSlideMaterialTabbed = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1280, 750));
        setMinimumSize(new java.awt.Dimension(1280, 750));
        setPreferredSize(new java.awt.Dimension(1280, 750));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(winButtonInternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 30, -1, -1));

        CabecalhodeClienteImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Img/Produto/cabecalho/CabecalhodeProduto.png"))); // NOI18N
        CabecalhodeClienteImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(CabecalhodeClienteImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 120));

        SlideMaterialTabbed.setBackground(new java.awt.Color(228, 223, 223));
        SlideMaterialTabbed.setToolTipText("");
        SlideMaterialTabbed.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SlideMaterialTabbed.setMaximumSize(new java.awt.Dimension(1280, 620));
        SlideMaterialTabbed.setMinimumSize(new java.awt.Dimension(1280, 620));
        SlideMaterialTabbed.setPreferredSize(new java.awt.Dimension(1280, 620));

        Painel_Tabela_Cliente.setBackground(new java.awt.Color(228, 223, 223));
        Painel_Tabela_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTabela.setBackground(new java.awt.Color(228, 223, 223));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        lblControleFuncionarios.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblControleFuncionarios.setForeground(new java.awt.Color(127, 127, 127));
        lblControleFuncionarios.setText("Controle Produto");

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        table = new Source.Classes.Table.Table(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome do Produto", "Descrição", "Preço", "Quantidade", "Nome do Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setAlignmentX(1.0F);
        table.setFocusable(false);
        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(0);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(0).setMaxWidth(950);
            table.getColumnModel().getColumn(2).setPreferredWidth(400);
            table.getColumnModel().getColumn(3).setMinWidth(0);
            table.getColumnModel().getColumn(3).setPreferredWidth(100);
            table.getColumnModel().getColumn(3).setMaxWidth(900);
            table.getColumnModel().getColumn(4).setPreferredWidth(10);
            table.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(lblControleFuncionarios)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblControleFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelTabelaLayout = new javax.swing.GroupLayout(PanelTabela);
        PanelTabela.setLayout(PanelTabelaLayout);
        PanelTabelaLayout.setHorizontalGroup(
            PanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTabelaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        PanelTabelaLayout.setVerticalGroup(
            PanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        Painel_Tabela_Cliente.add(PanelTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1300, 480));

        PanelButoes.setBackground(new java.awt.Color(228, 223, 223));
        PanelButoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnProximo.setBorder(null);
        btnProximo.setForeground(new java.awt.Color(62, 156, 241));
        btnProximo.setText("Anterior");
        btnProximo.setColorOver(new java.awt.Color(200, 235, 253));
        btnProximo.setFocusable(false);
        btnProximo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnProximo.setMaximumSize(new java.awt.Dimension(183, 51));
        btnProximo.setMinimumSize(new java.awt.Dimension(183, 51));
        btnProximo.setPreferredSize(new java.awt.Dimension(183, 51));
        btnProximo.setRadius(60);
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        PanelButoes.add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        btnAnteriro.setBorder(null);
        btnAnteriro.setForeground(new java.awt.Color(62, 156, 241));
        btnAnteriro.setText("Próximo");
        btnAnteriro.setColorOver(new java.awt.Color(200, 235, 253));
        btnAnteriro.setFocusable(false);
        btnAnteriro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnAnteriro.setMaximumSize(new java.awt.Dimension(183, 51));
        btnAnteriro.setMinimumSize(new java.awt.Dimension(183, 51));
        btnAnteriro.setPreferredSize(new java.awt.Dimension(183, 51));
        btnAnteriro.setRadius(60);
        btnAnteriro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriroActionPerformed(evt);
            }
        });
        PanelButoes.add(btnAnteriro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, -1));

        Painel_Tabela_Cliente.add(PanelButoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 460, 1300, 150));

        lblNomeDoPsquisar.setBackground(new java.awt.Color(0, 102, 255));
        lblNomeDoPsquisar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblNomeDoPsquisar.setText("Nome:");
        Painel_Tabela_Cliente.add(lblNomeDoPsquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 13, -1, -1));

        txtNomeParaPesquisar.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 15)); // NOI18N
        txtNomeParaPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeParaPesquisarActionPerformed(evt);
            }
        });
        txtNomeParaPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeParaPesquisarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeParaPesquisarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeParaPesquisarKeyTyped(evt);
            }
        });
        Painel_Tabela_Cliente.add(txtNomeParaPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 9, 340, -1));

        btnPesquisarTabela.setBorder(null);
        btnPesquisarTabela.setForeground(new java.awt.Color(62, 156, 241));
        btnPesquisarTabela.setText("Pesquisar");
        btnPesquisarTabela.setColorOver(new java.awt.Color(200, 235, 253));
        btnPesquisarTabela.setFocusable(false);
        btnPesquisarTabela.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        btnPesquisarTabela.setMaximumSize(new java.awt.Dimension(183, 51));
        btnPesquisarTabela.setMinimumSize(new java.awt.Dimension(183, 51));
        btnPesquisarTabela.setPreferredSize(new java.awt.Dimension(183, 51));
        btnPesquisarTabela.setRadius(30);
        btnPesquisarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarTabelaActionPerformed(evt);
            }
        });
        Painel_Tabela_Cliente.add(btnPesquisarTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 8, 90, 30));

        SlideMaterialTabbed.addTab("  Tabela", Painel_Tabela_Cliente);

        Painel_Dados_Cliente.setBackground(new java.awt.Color(228, 223, 223));
        Painel_Dados_Cliente.setPreferredSize(new java.awt.Dimension(1280, 540));
        Painel_Dados_Cliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Componentes.setBackground(new java.awt.Color(228, 223, 223));
        Componentes.setPreferredSize(new java.awt.Dimension(1280, 750));
        Componentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelBtn.setBackground(new java.awt.Color(228, 223, 223));
        PainelBtn.setAlignmentX(1.0F);
        PainelBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        PainelBtn.setLayout(flowLayout1);

        btnPesquisar.setBorder(null);
        btnPesquisar.setForeground(new java.awt.Color(62, 156, 241));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setColorOver(new java.awt.Color(200, 235, 253));
        btnPesquisar.setFocusable(false);
        btnPesquisar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnPesquisar.setMaximumSize(new java.awt.Dimension(183, 51));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(183, 51));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(183, 51));
        btnPesquisar.setRadius(60);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        PainelBtn.add(btnPesquisar);

        btnNovo.setBorder(null);
        btnNovo.setForeground(new java.awt.Color(62, 156, 241));
        btnNovo.setText("Novo");
        btnNovo.setColorOver(new java.awt.Color(200, 235, 253));
        btnNovo.setFocusable(false);
        btnNovo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnNovo.setMaximumSize(new java.awt.Dimension(183, 51));
        btnNovo.setMinimumSize(new java.awt.Dimension(183, 51));
        btnNovo.setPreferredSize(new java.awt.Dimension(183, 51));
        btnNovo.setRadius(60);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        PainelBtn.add(btnNovo);

        btnSalvar.setBorder(null);
        btnSalvar.setForeground(new java.awt.Color(62, 156, 241));
        btnSalvar.setText("Salvar");
        btnSalvar.setColorOver(new java.awt.Color(200, 235, 253));
        btnSalvar.setFocusable(false);
        btnSalvar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnSalvar.setMaximumSize(new java.awt.Dimension(183, 51));
        btnSalvar.setMinimumSize(new java.awt.Dimension(183, 51));
        btnSalvar.setPreferredSize(new java.awt.Dimension(183, 51));
        btnSalvar.setRadius(60);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        PainelBtn.add(btnSalvar);

        btnAlterar.setBorder(null);
        btnAlterar.setForeground(new java.awt.Color(62, 156, 241));
        btnAlterar.setText("Alterar");
        btnAlterar.setColorOver(new java.awt.Color(200, 235, 253));
        btnAlterar.setFocusable(false);
        btnAlterar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnAlterar.setMaximumSize(new java.awt.Dimension(183, 51));
        btnAlterar.setMinimumSize(new java.awt.Dimension(183, 51));
        btnAlterar.setPreferredSize(new java.awt.Dimension(183, 51));
        btnAlterar.setRadius(60);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        PainelBtn.add(btnAlterar);

        btnRemover.setBorder(null);
        btnRemover.setForeground(new java.awt.Color(62, 156, 241));
        btnRemover.setText("Remover");
        btnRemover.setColorOver(new java.awt.Color(200, 235, 253));
        btnRemover.setFocusable(false);
        btnRemover.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnRemover.setHideActionText(true);
        btnRemover.setMargin(new java.awt.Insets(2, 30, 2, 30));
        btnRemover.setMaximumSize(new java.awt.Dimension(183, 51));
        btnRemover.setMinimumSize(new java.awt.Dimension(183, 51));
        btnRemover.setPreferredSize(new java.awt.Dimension(183, 51));
        btnRemover.setRadius(60);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        PainelBtn.add(btnRemover);

        btnLimpar.setBorder(null);
        btnLimpar.setForeground(new java.awt.Color(62, 156, 241));
        btnLimpar.setText("Limpar");
        btnLimpar.setColorOver(new java.awt.Color(200, 235, 253));
        btnLimpar.setFocusable(false);
        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnLimpar.setMaximumSize(new java.awt.Dimension(183, 51));
        btnLimpar.setMinimumSize(new java.awt.Dimension(183, 51));
        btnLimpar.setPreferredSize(new java.awt.Dimension(183, 51));
        btnLimpar.setRadius(60);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        PainelBtn.add(btnLimpar);

        Componentes.add(PainelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1280, -1));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtId.setBorder(null);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        Componentes.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 397, 38));

        txtNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNome.setBorder(null);
        txtNome.setOpaque(false);
        Componentes.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 129, 390, 38));
        txtNome.getAccessibleContext().setAccessibleName("");

        txtDescricao.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtDescricao.setBorder(null);
        txtDescricao.setOpaque(false);
        Componentes.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 300, 545, 38));

        txtQtn_Estoque.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtQtn_Estoque.setBorder(null);
        txtQtn_Estoque.setOpaque(false);
        Componentes.add(txtQtn_Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 240, 390, 38));

        txtPreco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPreco.setBorder(null);
        txtPreco.setOpaque(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        Componentes.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 185, 390, 38));

        cbxFornecedor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxFornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxFornecedorMouseClicked(evt);
            }
        });
        cbxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFornecedorActionPerformed(evt);
            }
        });
        Componentes.add(cbxFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 70, 397, 38));

        CadastrodeDadosdoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Img/Produto/cabecalho/CadastrodeDadosdoFuncionario.png"))); // NOI18N
        Componentes.add(CadastrodeDadosdoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, -1));

        Painel_Dados_Cliente.add(Componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 560));

        SlideMaterialTabbed.addTab("Dados", Painel_Dados_Cliente);

        getContentPane().add(SlideMaterialTabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 120, 1340, 730));

        BackgroundSlideMaterialTabbed.setBackground(new java.awt.Color(228, 223, 223));

        javax.swing.GroupLayout BackgroundSlideMaterialTabbedLayout = new javax.swing.GroupLayout(BackgroundSlideMaterialTabbed);
        BackgroundSlideMaterialTabbed.setLayout(BackgroundSlideMaterialTabbedLayout);
        BackgroundSlideMaterialTabbedLayout.setHorizontalGroup(
            BackgroundSlideMaterialTabbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        BackgroundSlideMaterialTabbedLayout.setVerticalGroup(
            BackgroundSlideMaterialTabbedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(BackgroundSlideMaterialTabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1360, 50));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 240, 120));

        setBounds(0, 0, 1314, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriroActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProximoActionPerformed
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //Carregar a lista
        CarregarTabela();
    }//GEN-LAST:event_formInternalFrameActivated
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        //Pegando os dados da tabela para o formulario
        SlideMaterialTabbed.setSelectedIndex(1);
        txtId.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        txtNome.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        txtDescricao.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        txtQtn_Estoque.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        txtPreco.setText(table.getValueAt(table.getSelectedRow(), 4).toString());

        Fornecedor obj = new Fornecedor();
        DAOFornecedor dao = new DAOFornecedor();
        obj = dao.buscaFornecedorPorNomeFrameDados(table.getValueAt(table.getSelectedRow(), 5).toString());

        cbxFornecedor.removeAllItems();
        cbxFornecedor.getModel().setSelectedItem(obj);

    }//GEN-LAST:event_tableMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //botao alterar
        Produto obj = new Produto();
        obj.setNome(txtNome.getText());
        obj.setDescricao(txtDescricao.getText());
        obj.setPreco(Double.parseDouble(txtQtn_Estoque.getText()));
        obj.setQtd_estoque(Integer.parseInt(txtPreco.getText()));

        Fornecedor f = new Fornecedor();
        f = (Fornecedor) cbxFornecedor.getSelectedItem();

        obj.setFornecedor(f);

        DAOProduto dao = new DAOProduto();
        dao.Update(obj);
        CarregarTabela();
        setarCamposVazios();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        Produto obj = new Produto();
        obj.setId_produto(Integer.parseInt(txtId.getText()));
        DAOProduto dao = new DAOProduto();
        dao.Delete(obj);
        CarregarTabela();
        setarCamposVazios();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Produto obj = new Produto();
        Fornecedor f = new Fornecedor();
        f = (Fornecedor) cbxFornecedor.getSelectedItem();
        obj.setFornecedor(f);
        obj.setNome(txtNome.getText());
        obj.setDescricao(txtDescricao.getText());
        obj.setPreco(Double.parseDouble(txtQtn_Estoque.getText()));
        obj.setQtd_estoque(Integer.parseInt(txtPreco.getText()));
        DAOProduto dao = new DAOProduto();
        dao.Save(obj);
        CarregarTabela();
        setarCamposVazios();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        setarCamposVazios();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarTabelaActionPerformed
        Pesquisar();
    }//GEN-LAST:event_btnPesquisarTabelaActionPerformed

    private void txtNomeParaPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeParaPesquisarKeyPressed
        // TODO add your handling code here:
        Pesquisar();
    }//GEN-LAST:event_txtNomeParaPesquisarKeyPressed

    private void txtNomeParaPesquisarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeParaPesquisarKeyTyped
        // TODO add your handling code here:
        Pesquisar();
    }//GEN-LAST:event_txtNomeParaPesquisarKeyTyped

    private void txtNomeParaPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeParaPesquisarKeyReleased
        // TODO add your handling code here:
        Pesquisar();
    }//GEN-LAST:event_txtNomeParaPesquisarKeyReleased

    private void txtNomeParaPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeParaPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeParaPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        setarCamposVazios();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void cbxFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxFornecedorAncestorAdded
        // TODO add your handling code here:
        DAOFornecedor dao = new DAOFornecedor();
        List<Fornecedor> listFornecedor = dao.listarFornecedor();
        cbxFornecedor.removeAll();
        for (Fornecedor f : listFornecedor) {
            cbxFornecedor.addItem(f);
        }
        cbxFornecedor.repaint();
        cbxFornecedor.revalidate();

    }//GEN-LAST:event_cbxFornecedorAncestorAdded

    private void cbxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFornecedorActionPerformed

    private void cbxFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxFornecedorMouseClicked
        // TODO add your handling code here:
        DAOFornecedor dao = new DAOFornecedor();
        List<Fornecedor> listFornecedor = dao.listarFornecedor();
        cbxFornecedor.removeAllItems();

        for (Fornecedor f : listFornecedor) {
            cbxFornecedor.addItem(f);
        }
    }//GEN-LAST:event_cbxFornecedorMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        Produto obj = new Produto();
        DAOProduto dao = new DAOProduto();

        obj = dao.buscaProdutoPorNomeFrameDados(nome);

        cbxFornecedor.removeAllItems();  // Apago todos os fornecedores e depois busco apenas o do produto que será filtrado

        if (obj.getNome() != null) {
            txtId.setText(String.valueOf(obj.getId_produto()));
            txtNome.setText(obj.getNome());
            txtDescricao.setText(obj.getDescricao());
            txtQtn_Estoque.setText(String.valueOf(obj.getPreco()));
            txtPreco.setText(String.valueOf(obj.getQtd_estoque()));
            Fornecedor f = new Fornecedor();
            DAOFornecedor Fdao = new DAOFornecedor();

            f = Fdao.buscaFornecedorPorNomeFrameDados(obj.getFornecedor().getNome());

            cbxFornecedor.getModel().setSelectedItem(f);

        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado");
        }


    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundSlideMaterialTabbed;
    private javax.swing.JLabel CabecalhodeClienteImg;
    private javax.swing.JLabel CadastrodeDadosdoFuncionario;
    private javax.swing.JPanel Componentes;
    private javax.swing.JPanel PainelBtn;
    private javax.swing.JPanel Painel_Dados_Cliente;
    private javax.swing.JPanel Painel_Tabela_Cliente;
    private javax.swing.JPanel PanelButoes;
    private javax.swing.JPanel PanelTabela;
    private Source.Classes.Slide.MaterialTabbed SlideMaterialTabbed;
    private Source.Button.ButtonCommun btnAlterar;
    private Source.Button.ButtonCommun btnAnteriro;
    private Source.Button.ButtonCommun btnLimpar;
    private Source.Button.ButtonCommun btnNovo;
    private Source.Button.ButtonCommun btnPesquisar;
    private Source.Button.ButtonCommun btnPesquisarTabela;
    private Source.Button.ButtonCommun btnProximo;
    private Source.Button.ButtonCommun btnRemover;
    private Source.Button.ButtonCommun btnSalvar;
    private javax.swing.JComboBox cbxFornecedor;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblControleFuncionarios;
    private javax.swing.JLabel lblNomeDoPsquisar;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private Source.Classes.Table.Table table;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeParaPesquisar;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtn_Estoque;
    private Source.ButtonTitleBar.WinButtonInternal winButtonInternal;
    // End of variables declaration//GEN-END:variables
}
