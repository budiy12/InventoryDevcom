class Barang {
    public int id;
    public String nama;
    public int harga;
    
    public Barang(int ids, String namas, int hargas){
        this.id = ids;
        this.nama = namas;
        this.harga = hargas;
    }
}

public class InventoryDevcom {
    static int totalHarga(Barang[] bs){
        int total=0;
        for (int i=0;i<5;i++){
            total+=bs[i].harga;
        }
        return total;
    }

    static void print(Barang[] barangs){
        for (int i=0;i<5;i++){
            System.out.printf(
                "id %d\nnama: %s\nharga: %d\n\n",
                barangs[i].id,
                barangs[i].nama,
                barangs[i].harga
            );
        }
        System.out.printf("Total Harga: %d",totalHarga(barangs));
    }

    public static void main(String[] args) {
        Barang[] barangs = new Barang[5];
        String[] namaBarang = {"sampo","sabun","sendal", "sepatu", "sendok"};
        int[] hargaBarang = {1000, 2000, 3000, 4000, 5000}; 

        for (int i=0;i<5;i++){
            barangs[i]=new Barang(i, namaBarang[i], hargaBarang[i]);
        }

        print(barangs);

        // for (int i=0;i<5;i++){
        //     System.out.printf(
        //         "id %d\nnama: %s\nharga: %d\n\n",
        //         barangs[i].id,
        //         barangs[i].nama,
        //         barangs[i].harga
        //     );
        // }

        // Barang barang = new Barang(1,"Macbook Pro 2018",2000);
        // System.out.println(barang.id + "\n" + barang.nama + "\nRp." + barang.harga);
    }
}