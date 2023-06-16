public class BPiz {
    private Pizzas _pizzas;

    public BPiz(){
        _pizzas = new Pizzas();
    }

    public BPiz setMasa(String masa){
        _pizzas.setMasa(masa);
        return this;
    }

    public BPiz setCebolla(boolean x){
        _pizzas.setCebolla(x);
        return this;
    }

    public BPiz setChampiñones(boolean x){
        _pizzas.setChampiñones(x);
        return this;
    }

    public BPiz setPiña(boolean x){
        _pizzas.setPiña(x);
        return this;
    }

    public BPiz setJamon(boolean x){
        _pizzas.setJamon(x);
        return this;
    }

    public BPiz setExtraQueso(boolean x){
        _pizzas.setExtraQueso(x);
        return this;
    }

    public BPiz setRelleno(boolean x){
        _pizzas.setRelleno(x);
        return this;
    }

    public BPiz setSalsa(boolean x){
        _pizzas.setSalsa(x);
        return this;
    }

    public BPiz setSinGluten(boolean x){
        _pizzas.setSinGluten(x);
        return this;
    }

    public BPiz setTamaño(int tamaño){
        _pizzas.setTamaño(tamaño);
        return this;
    }

    public BPiz setTipoSalsa(String salsa){
        _pizzas.setTipoSalsa(salsa);
        return this;
    }

    public Pizzas build(){
        return this._pizzas;
    }
}
