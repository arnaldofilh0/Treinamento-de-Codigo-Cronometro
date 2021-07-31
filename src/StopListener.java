public class StopListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!myThread.isStopThread()) {
            thread = null;
            myThread.stopThread(true);
        }
        myThread.beginThread(true);
        btnStart.setText("Start");
        set.IconImage(new ImageIcon("image/clock_stop.png").getImage());
    }

    
    
}
