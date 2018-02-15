package bo.edu.cursojava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static java.net.URI.create;

public class BlocDeNotas extends JFrame {
    private JMenuBar menuBar;
    private JMenu menuArchivo;
    private JMenuItem itemNuevo, itemAbrir, itemGuardar, itemGuardarComo, itemConfigurarPagina, itemImprimir, itemSalir;
    private JMenu menuEdicion;
    private JMenuItem itemDeshacer, itemCortar, itemCopiar, itemPegar, itemEliminar, itemBuscar, itemBuscarSiguiente, itemReemplazar, itemIrA, itemSeleccionar;
    private JMenu menuFormato;
    private JMenuItem itemAjusteDeLinea, itemFuente;
    private JMenu menuVer;
    private JMenuItem itemBarraDeEstado;
    private JMenu menuAyuda;
    private JMenuItem itemVerAyuda, itemAcercaDe;
    private JPanel areaTrabajo;

    public BlocDeNotas() {
        super("Ventana Principal");
        setSize(600, 600);
        setLayout(new BorderLayout());

        menuBar = new JMenuBar();
        add(menuBar, BorderLayout.NORTH);
        //Menu archivo
        menuArchivo = new JMenu("Archivo");
        itemNuevo = new JMenuItem("Nuevo        Ctrl+N");
        itemAbrir = new JMenuItem("Abrir...");
        itemGuardar = new JMenuItem("Guardar");
        itemGuardarComo=new JMenuItem("Guardar como      ");
        itemConfigurarPagina = new JMenuItem("Configurar página...");
        itemImprimir= new JMenuItem("Imprimir");
        itemSalir=new JMenuItem("Salir");
        //Menu Edicion
        menuEdicion = new JMenu("Edición");
        itemDeshacer=new JMenuItem("Deshacer");
        itemCortar=new JMenuItem("Cortar");
        itemCopiar=new JMenuItem("Copiar");
        itemPegar=new JMenuItem("Pegar");
        itemEliminar= new JMenuItem("Eliminar");
        itemBuscar= new JMenuItem("Buscar...");
        itemBuscarSiguiente= new JMenuItem("Buscar Siguiente");
        itemReemplazar= new JMenuItem("Reemplazar...");
        itemIrA= new JMenuItem("Ir a...");
        itemSeleccionar= new JMenuItem("Seleccionar");
        //Menu Formato
        menuFormato = new JMenu("Formato");
        itemAjusteDeLinea= new JMenuItem("Ajuste de línea");
        itemFuente= new JMenuItem("Fuente");
        //Menu Ver
        menuVer = new JMenu("Ver");
        itemBarraDeEstado= new JMenuItem("Barra de estado");
        //Menu Ayuda
        menuAyuda = new JMenu("Ayuda");
        itemVerAyuda= new JMenu("Ver la ayuda");
        itemAcercaDe= new JMenu("Acerca del Bloc de notas");

        //agregar elementos
        setJMenuBar(menuBar);

        menuBar.add(menuArchivo);
        //agregando Item Menu Archivo
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.add(itemGuardarComo);
        menuArchivo.add(itemConfigurarPagina);
        menuArchivo.add(itemImprimir);
        menuArchivo.add(itemSalir);

        menuBar.add(menuEdicion);
        //agregando item Menu Edicion
        menuEdicion.add(itemDeshacer);
        menuEdicion.add(itemCortar);
        menuEdicion.add(itemCopiar);
        menuEdicion.add(itemPegar);
        menuEdicion.add(itemEliminar);
        menuEdicion.add(itemBuscar);
        menuEdicion.add(itemBuscarSiguiente);
        menuEdicion.add(itemReemplazar);
        menuEdicion.add(itemIrA);
        menuEdicion.add(itemSeleccionar);

        menuBar.add(menuFormato);
        //Agregando item menu Formato
        menuFormato.add(itemAjusteDeLinea);
        menuFormato.add(itemFuente);

        menuBar.add(menuVer);
        //Agregando item menu Ver
        menuVer.add(itemBarraDeEstado);

        menuBar.add(menuAyuda);
        //Agregando item menu Ayuda
        menuAyuda.add(itemVerAyuda);
        menuAyuda.add(itemAcercaDe);

        areaTrabajo = new JPanel();

        add(areaTrabajo, BorderLayout.CENTER);

        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        itemVerAyuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.google.com.bo"));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "ERROR, no se puede ejecutar la accion");
                }
            }
        });

    }
}


