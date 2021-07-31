import javax.swing.ImageIcon;

public class StartListener implements ActionListener {

   @Override
   public void actionPerformed(ActionEvent e) {
      if (thread == null) {
         tempo.setText("00:00:00");
         myThread = new AtualizaLabel();
         thread = new Thread(myThread);
         thread.start();
      }
      btnStart.setText("Start");
      myThread.pausedThread(false);
      setIconImage(new ImageIcon("image/clock_play.png").getImage);

   }
}
