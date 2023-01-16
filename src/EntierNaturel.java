public class EntierNaturel {
    private int val;
    EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        }
        this.val = val;
    }
    int getVal() {
        return val;
    }
    void setVal(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        }
        this.val = val;
    }
    void decrementer() throws NombreNegatifException {
        if (val == 0) {
            throw new NombreNegatifException(val);
        }
        val--;
    }
}