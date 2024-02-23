public class RelojDigital extends JFrame {
    private JLabel relojLabel;

    public RelojDigital() {
        super("Reloj Digital");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        relojLabel = new JLabel("", JLabel.CENTER);
        relojLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(relojLabel, BorderLayout.CENTER);

        // Crear y empezar el hilo del reloj
        Thread relojThread = new Thread(new RelojRunnable());
        relojThread.start();
    }

    // Clase interna para manejar la lógica del reloj en un hilo separado
    private class RelojRunnable implements Runnable {
        @Override
        public void run() {
            SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                String horaActual = formato.format(new Date());
                relojLabel.setText(horaActual);
                try {
                    Thread.sleep(1000); // Esperar 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RelojDigital().setVisible(true);
        });
    }
}
