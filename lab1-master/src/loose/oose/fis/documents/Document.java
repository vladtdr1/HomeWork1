package loose.oose.fis.documents;

public abstract class Document {
    protected String[] conti;

    public Document(String[] continut) {
        this.conti = continut;
    }

    public abstract String[] analizeaza();

    @Override
    public String toString() {
        String res = "";
        for (String cuvant : conti) {
            res += cuvant + " ";
        }
        return res;
    }
}
