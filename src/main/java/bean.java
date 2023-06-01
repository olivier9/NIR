
public class NIR {
    Byte sexe = 0;
    Byte anneeNaissance = 0;
    Byte moisNaissance = 0;
    String lieuNaissance ="";
    Short ordrenaissance =0;

    Byte clef =0;
    String nir ="";
    boolean isValide;

    public Byte getSexe() {
        return sexe;
    }

    public void setSexe(Byte sexe) {
        this.sexe = sexe;
    }

    public Byte getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(Byte anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public Byte getMoisNaissance() {
        return moisNaissance;
    }

    public void setMoisNaissance(Byte moisNaissance) {
        this.moisNaissance = moisNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public Short getOrdrenaissance() {
        return ordrenaissance;
    }

    public void setOrdrenaissance(Short ordrenaissance) {
        this.ordrenaissance = ordrenaissance;
    }

    public Byte getClef() {
        return clef;
    }

    public void setClef(Byte clef) {
        this.clef = clef;
    }

    public String getNir() {
        return nir;
    }

    public void setNir(String nir) {
        this.nir = nir;
    }

    public void setValide(boolean valide) {
        isValide = valide;
    }

    public void NirToString () {
    nir = sexe.toString() + anneeNaissance.toString();
}

    public boolean isValide() {
        if (sexe != 1 || sexe!= 2 || sexe !=7 || sexe!=8) {return false;};
        if (anneeNaissance >99 && anneeNaissance <00) {return false;};
        if (!(moisNaissance <13 || moisNaissance >0 || moisNaissance == 20 || moisNaissance == 30 || moisNaissance == 50)) {return false;};
        if (!(Integer.parseInt(lieuNaissance.substring(0,1)) > 01 && (Integer.parseInt(lieuNaissance.substring(0,1)) < 99 || (lieuNaissance.substring(0,1)=="2A" || lieuNaissance.substring(0,1)=="2B" ))));
        if (ordrenaissance < 1) {return false;};
        if (clef >0 && clef < 98) {return false}
        return true;
}
public void convertirNirCorse (Long NIR) {
    nir.replace("2B", "19");
}



}
