package loose.oose.fis.documents;

public abstract class Document {
    protected String[] cont;

    public Document(String[] continut) {
        this.cont = continut;
    }

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        String res = "";
        for (String cuvant : cont) {
            res += cuvant + " ";
        }
        return res;
    }
}
