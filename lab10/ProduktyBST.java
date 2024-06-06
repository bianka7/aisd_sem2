package lab10;

public class ProduktyBST {
    private class Product {
        String kod;
        double cena;

        Product(String kod, double cena) {
            this.kod = kod;
            this.cena = cena;
        }
    }

    private Product[] bst;
    private int n;

    public ProduktyBST() {
        bst = new Product[7];
        n = 0;
    }

    public void put(String code, double price) {
        int index = findIndex(code);
        if (index != -1) {
            bst[index].cena = price;
        } else {
            if (n < bst.length) {
                bst[n++] = new Product(code, price);
            } else {
                System.out.println("BST is full, cannot insert more elements.");
            }
        }
    }

    public Double get(String code) {
        int index = findIndex(code);
        if (index != -1) {
            return bst[index].cena;
        }
        return null;
    }

    public void delete(String code) {
        int index = findIndex(code);
        if (index != -1) {
            bst[index] = bst[n - 1];
            bst[n - 1] = null;
            n--;
        }
    }

    public int size() {
        return n;
    }

    public static void print(ProduktyBST bst) {
        for (int i = 0; i < bst.size(); i++) {
            System.out.println(bst.bst[i].kod + ", " + bst.bst[i].cena);
        }
        System.out.println();
    }

    private int findIndex(String code) {
        for (int i = 0; i < n; i++) {
            if (bst[i].kod.equals(code)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ProduktyBST bst = new ProduktyBST();
        String[] kod = {"P01", "P07", "P03", "P02", "P09"};
        double[] cena = {14.90, 27.10, 120.00, 31.80, 39.20};

        System.out.println("Tworzenie drzewa: ");
        for (int i = 0; i < kod.length; i++) {
            bst.put(kod[i], cena[i]);
        }

        print(bst);

        System.out.println("a) Zmień cenę produktu „P03” na 99,90: ");
        bst.put("P03", 99.90);
        print(bst);

        System.out.println("b) Dodaj produkt „P04” w cenie 18,50: ");
        bst.put("P04", 18.50);
        print(bst);

        System.out.println("c) Usuń produkt „P01”");
        bst.delete("P01");
        print(bst);
    }
}
