package ba.unsa.etf.rpr;

public class Sat {
    private int Sat,Minute,Sekunde;
Sat(int sati, int minute, int sekunde){
    Postavi(sati,minute,sekunde);
}
   void Postavi(int sati,int minute,int sekunde){
       Sat=sati;Minute=minute;Sekunde=sekunde;
   }
   void Prethodni(){
    Sekunde--;
    if(Sekunde==-1){
        Sekunde=59;
        Minute--;
    }
    if(Minute==-1){
        Minute=59;
        Sat--;
    }
    if(Sat==-1) Sat=23;
   }
        void   Sljedeci(){
    Sekunde++;
    if(Sekunde==60){
        Sekunde=0;
        Minute++;
    }
    if(Minute==60){
    Minute=0;
    Sat--;    }
    if(Sat==24) Sat=23;
        }
     void pomjeriZa(int pomak){
    if(pomak>0){
        for(int i=0;i<pomak;i++) Sljedeci();
    }
    else{
        for(int i=0;i<pomak*-1;i++) Prethodni();
    }
     }

    public int getSat() {
        return Sat;
    }

    public int getMinute() {
        return Minute;
    }

    public int getSekunde() {
        return Sekunde;
    }
    void Ispisi(){
    System.out.println("sati: "+getSat()+" minute: "+getMinute()+" sekunde: "+getSekunde());

    }
}
