public class AtualizaLabel {
   private boolean begin;
   private boolean stop;
   private boolean paused;

   public AtualizaLabel() {
      beginThread(true);
      stopThread(false);
      pausedThread(false);
   }
   
   private void beginThread(boolean begin) {
      this.begin = begin;
   }
   
   private boolean isBeginThread() {
       return begin;
   }

   private void stopThread(boolean stop) {
       this.stop = stop;
   }

   private void pauseThread(boolean pause) {
       this.pause = pause;
   }
   
   private boolean isPauseThread() {
       return pause;
   }
   
   @Override
   public void run() {
       while (!isStopThread()) {
           if(!isPauseThread()) {
               if(!isBeginThread()) {
                   tempo.setText(tempoFormato());
               } else {
                   beginThread(false);
               }
           }
           try{
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       segundos = 0;
   }
}
