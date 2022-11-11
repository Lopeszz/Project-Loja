/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Init;

import DAO.DAOFornecedor;
import Modelos.Fornecedor;
import java.awt.Font;
import java.awt.FontFormatException;
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
public class FornecedorInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FornecedorInternalFrame(javax.swing.JDesktopPane JDesktopPane) {
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
        txtCnpj.setText("");
        txtEmail.setText("");
        txtCelular.setText("");
        txtCep.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        cbxEstado.setSelectedIndex(0);
    }

    private void initTable() {
        table.fixTable(jScrollPane1);
    }

    private void initFont() {
        btnProximo.setFont(Pegandoafont());
        btnAnteriro.setFont(Pegandoafont());
    }

    private void initWinButtonInternal() {
        winButtonInternal.initEvent(FornecedorInternalFrame.this);
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
        DAOFornecedor dao = new DAOFornecedor();
        List<Fornecedor> Lista = dao.listarfornecedor();
        DefaultTableModel dados = (DefaultTableModel) table.getModel();
        dados.setNumRows(0);
        for (Fornecedor obj : Lista) {
            dados.addRow(new Object[]{
                obj.getId_fornecedor(),
                obj.getNome(),
                obj.getCnpj(),
                obj.getEmail(),
                obj.getCelular(),
                obj.getCep(),
                obj.getRua(),
                obj.getNumero(),
                obj.getComplemento(),
                obj.getBairro(),
                obj.getCidade(),
                obj.getEstado()
            });

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winButtonInternal = new Source.ButtonTitleBar.WinButtonInternal();
        CabecalhodeFornecedorImg = new javax.swing.JLabel();
        SlideMaterialTabbed = new Source.Classes.Slide.MaterialTabbed();
        Painel_Tabela_Fornecedor = new javax.swing.JPanel();
        PanelTabela = new javax.swing.JPanel();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        lblControleFuncionarios = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Source.Classes.Table.Table();
        PanelButoes = new javax.swing.JPanel();
        btnProximo = new Source.Button.ButtonCommun();
        btnAnteriro = new Source.Button.ButtonCommun();
        Painel_Dados_Fornecedor = new javax.swing.JPanel();
        Componentes = new javax.swing.JPanel();
        PainelBtn = new javax.swing.JPanel();
        btnNovo = new Source.Button.ButtonCommun();
        btnSalvar = new Source.Button.ButtonCommun();
        btnRemover = new Source.Button.ButtonCommun();
        btnAlterar = new Source.Button.ButtonCommun();
        btnCancelar = new Source.Button.ButtonCommun();
        txtId = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        txtRua = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        CadastrodeDadosdoFuncionario = new javax.swing.JLabel();
        BackgroundSlideMaterialTabbed = new javax.swing.JPanel();
        BackgroundTopRight = new javax.swing.JPanel();

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

        CabecalhodeFornecedorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Img/Fornecedor/cabecalho/CabecalhodoFornecedor.png"))); // NOI18N
        CabecalhodeFornecedorImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(CabecalhodeFornecedorImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 120));

        SlideMaterialTabbed.setBackground(new java.awt.Color(228, 223, 223));
        SlideMaterialTabbed.setToolTipText("");
        SlideMaterialTabbed.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        SlideMaterialTabbed.setMaximumSize(new java.awt.Dimension(1280, 620));
        SlideMaterialTabbed.setMinimumSize(new java.awt.Dimension(1280, 620));
        SlideMaterialTabbed.setPreferredSize(new java.awt.Dimension(1280, 620));

        Painel_Tabela_Fornecedor.setBackground(new java.awt.Color(228, 223, 223));
        Painel_Tabela_Fornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTabela.setBackground(new java.awt.Color(228, 223, 223));

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        lblControleFuncionarios.setFont(new java.awt.Font("SansSerif", 1, 26)); // NOI18N
        lblControleFuncionarios.setForeground(new java.awt.Color(127, 127, 127));
        lblControleFuncionarios.setText("Controle Fornecedor");

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        table = new Source.Classes.Table.Table(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CNPJ", "E-Mail", "Celular", "CEP", "Rua", "Nº", "Comp.", "Bairro", "Cidade", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            table.getColumnModel().getColumn(0).setPreferredWidth(3);
            table.getColumnModel().getColumn(7).setPreferredWidth(10);
            table.getColumnModel().getColumn(8).setPreferredWidth(50);
            table.getColumnModel().getColumn(11).setPreferredWidth(4);
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

        Painel_Tabela_Fornecedor.add(PanelTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 480));

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
        PanelButoes.add(btnProximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        btnAnteriro.setBorder(null);
        btnAnteriro.setForeground(new java.awt.Color(62, 156, 241));
        btnAnteriro.setText("Próximo");
        btnAnteriro.setColorOver(new java.awt.Color(200, 235, 253));
        btnAnteriro.setFocusable(false);
        btnAnteriro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnAnteriro.setMaximumSize(new java.awt.Dimension(183, 51));
        btnAnteriro.setMinimumSize(new java.awt.Dimension(183, 51));
        btnAnteriro.setPreferredSize(new java.awt.Dimension(183, 51));
        btnAnteriro.setRadius(50);
        btnAnteriro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriroActionPerformed(evt);
            }
        });
        PanelButoes.add(btnAnteriro, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        Painel_Tabela_Fornecedor.add(PanelButoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 460, 1300, 150));

        SlideMaterialTabbed.addTab("  Tabela", Painel_Tabela_Fornecedor);

        Painel_Dados_Fornecedor.setBackground(new java.awt.Color(228, 223, 223));
        Painel_Dados_Fornecedor.setPreferredSize(new java.awt.Dimension(1280, 540));
        Painel_Dados_Fornecedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Componentes.setBackground(new java.awt.Color(228, 223, 223));
        Componentes.setPreferredSize(new java.awt.Dimension(1280, 750));
        Componentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelBtn.setBackground(new java.awt.Color(228, 223, 223));
        PainelBtn.setAlignmentX(1.0F);
        PainelBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        PainelBtn.setLayout(flowLayout1);

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

        btnCancelar.setBorder(null);
        btnCancelar.setForeground(new java.awt.Color(62, 156, 241));
        btnCancelar.setText("Cancelar");
        btnCancelar.setColorOver(new java.awt.Color(200, 235, 253));
        btnCancelar.setFocusable(false);
        btnCancelar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnCancelar.setMaximumSize(new java.awt.Dimension(183, 51));
        btnCancelar.setMinimumSize(new java.awt.Dimension(183, 51));
        btnCancelar.setPreferredSize(new java.awt.Dimension(183, 51));
        btnCancelar.setRadius(60);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        PainelBtn.add(btnCancelar);

        Componentes.add(PainelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1280, -1));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(204, 204, 204));
        txtId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtId.setBorder(null);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        Componentes.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 52, 390, 38));

        txtCnpj.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCnpj.setBorder(null);
        txtCnpj.setOpaque(false);
        Componentes.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 167, 390, 38));
        txtCnpj.getAccessibleContext().setAccessibleName("");

        txtCelular.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCelular.setBorder(null);
        txtCelular.setOpaque(false);
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });
        Componentes.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 282, 390, 38));

        txtCep.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCep.setBorder(null);
        txtCep.setOpaque(false);
        Componentes.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 339, 390, 38));

        txtNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNome.setBorder(null);
        txtNome.setOpaque(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        Componentes.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 390, 38));

        cbxEstado.setBackground(new java.awt.Color(225, 226, 230));
        cbxEstado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "MG", "AC", "AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","PA","PB","PR","PE","PI","RJ","RN","RS", "RO", "RR", "SC", "SP","SE","TO"
        }));
        cbxEstado.setBorder(null);
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });
        Componentes.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 280, 396, 38));

        txtRua.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtRua.setBorder(null);
        txtRua.setOpaque(false);
        Componentes.add(txtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 397, 390, 38));

        txtBairro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtBairro.setBorder(null);
        txtBairro.setOpaque(false);
        Componentes.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 112, 390, 38));
        txtBairro.getAccessibleContext().setAccessibleName("");

        txtNumero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtNumero.setBorder(null);
        txtNumero.setOpaque(false);
        Componentes.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 50, 390, 38));

        txtCidade.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCidade.setBorder(null);
        txtCidade.setOpaque(false);
        Componentes.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 172, 390, 38));

        txtComplemento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtComplemento.setBorder(null);
        txtComplemento.setOpaque(false);
        Componentes.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 227, 390, 38));

        txtEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.setOpaque(false);
        Componentes.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 225, 390, 38));

        CadastrodeDadosdoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Img/Fornecedor/cabecalho/CadastrodeDadosdoFornecedor.png"))); // NOI18N
        Componentes.add(CadastrodeDadosdoFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1310, -1));

        Painel_Dados_Fornecedor.add(Componentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 580));

        SlideMaterialTabbed.addTab("Dados", Painel_Dados_Fornecedor);

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

        BackgroundTopRight.setBackground(new java.awt.Color(236, 236, 236));

        javax.swing.GroupLayout BackgroundTopRightLayout = new javax.swing.GroupLayout(BackgroundTopRight);
        BackgroundTopRight.setLayout(BackgroundTopRightLayout);
        BackgroundTopRightLayout.setHorizontalGroup(
            BackgroundTopRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        BackgroundTopRightLayout.setVerticalGroup(
            BackgroundTopRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(BackgroundTopRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 240, 120));

        setBounds(0, 0, 1314, 760);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriroActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProximoActionPerformed
    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //Carregar a lista
        CarregarTabela();
    }//GEN-LAST:event_formInternalFrameActivated
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        //Pegando os dados da tabela para o formulario
        SlideMaterialTabbed.setSelectedIndex(1);
        txtId.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        txtNome.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        txtCnpj.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        txtEmail.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        txtCelular.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        txtCep.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        txtRua.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
        txtNumero.setText(table.getValueAt(table.getSelectedRow(), 7).toString());
        txtComplemento.setText(table.getValueAt(table.getSelectedRow(), 8).toString());
        txtBairro.setText(table.getValueAt(table.getSelectedRow(), 9).toString());
        txtCidade.setText(table.getValueAt(table.getSelectedRow(), 10).toString());
        cbxEstado.setSelectedItem(table.getValueAt(table.getSelectedRow(), 11).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        //botao alterar
        Fornecedor obj = new Fornecedor();
        obj.setNome(txtNome.getText());
        obj.setCnpj(txtCnpj.getText());
        obj.setEmail(txtEmail.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setRua(txtRua.getText());
        obj.setNumero(Integer.parseInt(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEstado(cbxEstado.getSelectedItem().toString());
        obj.setId_fornecedor(Integer.parseInt(txtId.getText()));
        DAOFornecedor dao = new DAOFornecedor();
        dao.Update(obj);
        CarregarTabela();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        Fornecedor obj = new Fornecedor();
        obj.setId_fornecedor(Integer.parseInt(txtId.getText()));
        DAOFornecedor dao = new DAOFornecedor();
        dao.Delete(obj);
        CarregarTabela();
        setarCamposVazios();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        Fornecedor obj = new Fornecedor();
        obj.setNome(txtNome.getText());
        obj.setCnpj(txtCnpj.getText());
        obj.setEmail(txtEmail.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setRua(txtRua.getText());
        obj.setNumero(Integer.valueOf(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEstado(cbxEstado.getSelectedItem().toString());
        DAOFornecedor dao = new DAOFornecedor();
        dao.Save(obj);
        CarregarTabela();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        setarCamposVazios();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundSlideMaterialTabbed;
    private javax.swing.JPanel BackgroundTopRight;
    private javax.swing.JLabel CabecalhodeFornecedorImg;
    private javax.swing.JLabel CadastrodeDadosdoFuncionario;
    private javax.swing.JPanel Componentes;
    private javax.swing.JPanel PainelBtn;
    private javax.swing.JPanel Painel_Dados_Fornecedor;
    private javax.swing.JPanel Painel_Tabela_Fornecedor;
    private javax.swing.JPanel PanelButoes;
    private javax.swing.JPanel PanelTabela;
    private Source.Classes.Slide.MaterialTabbed SlideMaterialTabbed;
    private Source.Button.ButtonCommun btnAlterar;
    private Source.Button.ButtonCommun btnAnteriro;
    private Source.Button.ButtonCommun btnCancelar;
    private Source.Button.ButtonCommun btnNovo;
    private Source.Button.ButtonCommun btnProximo;
    private Source.Button.ButtonCommun btnRemover;
    private Source.Button.ButtonCommun btnSalvar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblControleFuncionarios;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private Source.Classes.Table.Table table;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private Source.ButtonTitleBar.WinButtonInternal winButtonInternal;
    // End of variables declaration//GEN-END:variables
}
