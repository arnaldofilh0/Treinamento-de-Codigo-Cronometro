public class PauseListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        myThread.pausedThread(true);
        if (!myThread.isStopThread()) {
            btnStart.setText("Restart");
            setIconImage(new ImageIcon("image/clock_pause.png"));
        }
    }
    
}
