package GUI;

import java.awt.Dimension;
import javax.swing.JDesktopPane;

/**
 *
 * @author epren
 */
public class fmrMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public fmrMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(fmrMenu.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema");

        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        fmrMenu.jDesktopPane_menu.setBounds(0,0,ancho,(alto-110));
        this.add(jDesktopPane_menu);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_usuario = new javax.swing.JMenu();
        jMenuItem_nuevoUsuario = new javax.swing.JMenuItem();
        jMenuItem_gestionarUsuario = new javax.swing.JMenuItem();
        jMenu_ventas = new javax.swing.JMenu();
        jMenuItem_facturarVenta = new javax.swing.JMenuItem();
        jMenuItem_gestionarFactura = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_cobrosPendientes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_crearClientes = new javax.swing.JMenuItem();
        jMenuItem_gestionarClientes = new javax.swing.JMenuItem();
        jMenu_compras = new javax.swing.JMenu();
        jMenuItem_facturarCompra = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_crearProveedor = new javax.swing.JMenuItem();
        jMenuItem_gestionarProveedor = new javax.swing.JMenuItem();
        jMenu_inventario = new javax.swing.JMenu();
        jMenuItem_crearArticulo = new javax.swing.JMenuItem();
        jMenuItem_gestionarArticulo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_verInventario = new javax.swing.JMenuItem();
        jMenu_dinero = new javax.swing.JMenu();
        jMenu_salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu_usuario.setText("Usuario");
        jMenu_usuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu_usuario.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_nuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_nuevoUsuario.setText("Nuevo usuario");
        jMenuItem_nuevoUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu_usuario.add(jMenuItem_nuevoUsuario);

        jMenuItem_gestionarUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_gestionarUsuario.setText("Gestionar Usuarios");
        jMenuItem_gestionarUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem_gestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarUsuarioActionPerformed(evt);
            }
        });
        jMenu_usuario.add(jMenuItem_gestionarUsuario);

        jMenuBar1.add(jMenu_usuario);

        jMenu_ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu_ventas.setText("Ventas");
        jMenu_ventas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu_ventas.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_facturarVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_facturarVenta.setText("Facturar Venta");
        jMenuItem_facturarVenta.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ventas.add(jMenuItem_facturarVenta);

        jMenuItem_gestionarFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_gestionarFactura.setText("Gestionar Facturas Ventas");
        jMenuItem_gestionarFactura.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ventas.add(jMenuItem_gestionarFactura);
        jMenu_ventas.add(jSeparator2);

        jMenuItem_cobrosPendientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_cobrosPendientes.setText("Cobros Pendientes");
        jMenuItem_cobrosPendientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ventas.add(jMenuItem_cobrosPendientes);
        jMenu_ventas.add(jSeparator1);

        jMenuItem_crearClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_crearClientes.setText("Crear Cliente");
        jMenuItem_crearClientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ventas.add(jMenuItem_crearClientes);

        jMenuItem_gestionarClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_gestionarClientes.setText("Gestionar Cliente");
        jMenuItem_gestionarClientes.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_ventas.add(jMenuItem_gestionarClientes);

        jMenuBar1.add(jMenu_ventas);

        jMenu_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenu_compras.setText("Compras");
        jMenu_compras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu_compras.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_facturarCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_facturarCompra.setText("Facturar Compra");
        jMenuItem_facturarCompra.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_compras.add(jMenuItem_facturarCompra);
        jMenu_compras.add(jSeparator3);

        jMenuItem_crearProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_crearProveedor.setText("Crear Proveedor");
        jMenuItem_crearProveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_compras.add(jMenuItem_crearProveedor);

        jMenuItem_gestionarProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_gestionarProveedor.setText("Gestionar Proveedor");
        jMenuItem_gestionarProveedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_compras.add(jMenuItem_gestionarProveedor);

        jMenuBar1.add(jMenu_compras);

        jMenu_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu_inventario.setText("Inventarios");
        jMenu_inventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu_inventario.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem_crearArticulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_crearArticulo.setText("Crear Artículo");
        jMenuItem_crearArticulo.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_inventario.add(jMenuItem_crearArticulo);

        jMenuItem_gestionarArticulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_gestionarArticulo.setText("Gestionar Artículos");
        jMenuItem_gestionarArticulo.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_inventario.add(jMenuItem_gestionarArticulo);
        jMenu_inventario.add(jSeparator4);

        jMenuItem_verInventario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem_verInventario.setText("Ver Inventarios");
        jMenuItem_verInventario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenu_inventario.add(jMenuItem_verInventario);

        jMenuBar1.add(jMenu_inventario);

        jMenu_dinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu_dinero.setText("Dinero");
        jMenu_dinero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu_dinero.setPreferredSize(new java.awt.Dimension(150, 50));
        jMenuBar1.add(jMenu_dinero);

        jMenu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu_salir.setText("Salir");
        jMenu_salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMenu_salir.setPreferredSize(new java.awt.Dimension(150, 50));
        jMenuBar1.add(jMenu_salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_gestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_gestionarUsuarioActionPerformed

    private void jMenuItem_nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevoUsuarioActionPerformed
        JInternalFrameCrearUsuario crearUsuario = new JInternalFrameCrearUsuario();
        jDesktopPane_menu.add(crearUsuario);
        crearUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fmrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_cobrosPendientes;
    private javax.swing.JMenuItem jMenuItem_crearArticulo;
    private javax.swing.JMenuItem jMenuItem_crearClientes;
    private javax.swing.JMenuItem jMenuItem_crearProveedor;
    private javax.swing.JMenuItem jMenuItem_facturarCompra;
    private javax.swing.JMenuItem jMenuItem_facturarVenta;
    private javax.swing.JMenuItem jMenuItem_gestionarArticulo;
    private javax.swing.JMenuItem jMenuItem_gestionarClientes;
    private javax.swing.JMenuItem jMenuItem_gestionarFactura;
    private javax.swing.JMenuItem jMenuItem_gestionarProveedor;
    private javax.swing.JMenuItem jMenuItem_gestionarUsuario;
    private javax.swing.JMenuItem jMenuItem_nuevoUsuario;
    private javax.swing.JMenuItem jMenuItem_verInventario;
    private javax.swing.JMenu jMenu_compras;
    private javax.swing.JMenu jMenu_dinero;
    private javax.swing.JMenu jMenu_inventario;
    private javax.swing.JMenu jMenu_salir;
    private javax.swing.JMenu jMenu_usuario;
    private javax.swing.JMenu jMenu_ventas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
