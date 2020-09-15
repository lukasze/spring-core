package workshop.spring5.di;

/*
    TODO 2 klasa Colaborator, której instancja będzie tworzona i 'wstrzykiwana' z użyciem refleksji
  */
class Colaborator {
    private String name;

    public Colaborator(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chętnie pokolaboruję! Przkazana wartość: " + name;
    }
}
