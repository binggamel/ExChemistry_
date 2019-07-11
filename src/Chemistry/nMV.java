package Chemistry;

public class nMV {
    public double Ln = 0;
    public double LM = 0;
    public double LV = 0 ;

    public double Rn = 0;
    public double RV = 0 ;

    public nMV() {
    }

    public nMV(double ln, double LM, double LV) {
        Ln = ln;
        this.LM = LM;
        this.LV = LV;
    }

    public nMV(double rn, double RV) {
        Rn = rn;
        this.RV = RV;
    }

    public double getLn() {
        return Ln;
    }

    public void setLn(double ln) {
        Ln = ln;
    }

    public double getLM() {
        return LM;
    }

    public void setLM(double LM) {
        this.LM = LM;
    }

    public double getLV() {
        return LV;
    }

    public void setLV(double LV) {
        this.LV = LV;
    }

    public double getRn() {
        return Rn;
    }

    public void setRn(double rn) {
        Rn = rn;
    }

    public double getRV() {
        return RV;
    }

    public void setRV(double RV) {
        this.RV = RV;
    }


}
