package com.android.tonyvu.sc.demo.constant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.android.tonyvu.sc.demo.model.Product;

public final class Constant {
    public static final List<Integer> QUANTITY_LIST = new ArrayList<Integer>();

    static {
        for (int i = 1; i < 11; i++) QUANTITY_LIST.add(i);
    }

    public static final Product PRODUCT1 = new Product(1, "Yellow artificial bush", BigDecimal.valueOf(780.37), "Gaze this exotic daffodils in sparkling yellow color, amid lush green leaves,shining and twinkling.\n", "yellowplasticartificialwallbush");
    public static final Product PRODUCT2 = new Product(2, "Artificial Aster Bush", BigDecimal.valueOf(641.09), "These outdoor silk flowers are handcrafted to be gorgeous and natural", "artificialaster");
    public static final Product PRODUCT3 = new Product(3, "Poinsettia", BigDecimal.valueOf(2985.15), "A traditional symbol of the holiday season for nearly 200 years. Poinsett noticed the poinsettia by the side of a road in Southern Mexico", "poinsettias");
    public static final Product PRODUCT4 = new Product(4, "Synthetic bougainvillea", BigDecimal.valueOf(1069), "Yellow Synthetic Tall Bougainvillea Hanging Basket Decorative Artificial Plant", "synthetictallbougainvilleas");
    public static final Product PRODUCT5 = new Product(5, "Artificial Chrysanthemum", BigDecimal.valueOf(513), "Decorative Flowers & Wreaths,Daisy, Material: Silk, Model Number: silk daisy flower", "artificialchrysanthemum");
    public static final Product PRODUCT6 = new Product(6, "Artificial Peach Blossom", BigDecimal.valueOf(700), "They are Perfect for wedding bouquet/posy,table arrangement or elegant home decoration.Long lasting and realistic flowers.", "artificialpeach");
    public static final Product PRODUCT7 = new Product(7, "Artificial Pine Bonsai", BigDecimal.valueOf(801), "If you like a plant without the hassle of daily watering, This will be best for you", "artificialpines");
    public static final Product PRODUCT8 = new Product(8, "Artificial Marigold Garlands", BigDecimal.valueOf(11990), "ARTIFICIAL MARIGOLD FLUFFY FLOWERS GARLANDS FOR DECORATION.Made in INDIA and Made up of recycled fibers\n", "artificialmarigold");
    public static final Product PRODUCT9 = new Product(9, "Peace Lily", BigDecimal.valueOf(249), "Peace Lily, is a very popular indoor houseplant. \n", "peacelily");
    public static final Product PRODUCT10 = new Product(10, "Gardenia Dwarf", BigDecimal.valueOf(449), "Gardenia is a genus of flowering plants in the coffee family.  ", "gardeniadwarf");
    public static final Product PRODUCT11 = new Product(11, "Anthurium", BigDecimal.valueOf(949), "The anthurium red plant has a bright pink, a tube-shaped flower that sits on the end of a long stalk", "anthurium");
    public static final Product PRODUCT12 = new Product(12, "Anthurium Andreanum", BigDecimal.valueOf(949), "Anthurium andraeanum is one of the plants listed in the NASA Clean Air Study as effective in removing formaldehyde, xylene, toluene, and ammonia from the air", "anthuriumandreanum");
    public static final Product PRODUCT13 = new Product(13, "African Violets", BigDecimal.valueOf(749), "African violets, are a genus of 6–20 species of herbaceous perennial flowering plants in the family Gesneriaceae", "africanviolet");
    public static final Product PRODUCT14 = new Product(14, "Gloxinia", BigDecimal.valueOf(449), "A popular houseplant, was originally described and introduced to cultivation as Gloxinia speciosa ", "gloxinia");
    public static final Product PRODUCT15 = new Product(15, "Brazilian plume", BigDecimal.valueOf(349), "The Brazilian Plume Flower is perennial shrub with large deep green leaves", "brazilianplume");
    public static final Product PRODUCT16 = new Product(16, "Silver Dollar Plant", BigDecimal.valueOf(129.30), "It is a species of flowering plant native to the Balkans and south west Asia\n", "silverdollar");
    public static final Product PRODUCT17 = new Product(17, "Rose (Marigold Red)", BigDecimal.valueOf(199), "Rose is considered by many as the most beautiful of all flowers\n", "roses");
    public static final Product PRODUCT18 = new Product(18, "Bougainvillea", BigDecimal.valueOf(299), "Bougainvillea is a genus of thorny ornamental vines", "bougainvillea");
    public static final Product PRODUCT19 = new Product(19, "Singapore Daisy", BigDecimal.valueOf(199), "Blooms profusely with 1 yellow-orange flowers, which are borne singly on the end of each stem.", "singaporedaisywedelia");
    public static final Product PRODUCT20 = new Product(20, "Mogra", BigDecimal.valueOf(349), "Mogra is widely cultivated for its attractive and sweetly fragrant flowers.", "mograjasmine");
    public static final Product PRODUCT21 = new Product(21, "Meyenia Erecta Alba", BigDecimal.valueOf(299), "Thunbergia erecta is a herbaceous perennial climbing plant species", "meyeniaerecta");
    public static final Product PRODUCT22 = new Product(22, "Lavender", BigDecimal.valueOf(199), "It is a small evergreen shrub.This plant has gained the Royal Horticultural Society's Award of Garden Merit.", "lavenders");
    public static final Product PRODUCT23 = new Product(23, "Marigold", BigDecimal.valueOf(199), "Marigold are among the very popular flowers commonly found in India", "africanmarigold");
    public static final Product PRODUCT24 = new Product(24, "Sunflower", BigDecimal.valueOf(125), "Sunflowers say summer like no other plant.\n", "sunflower");
    public static final List<Product> PRODUCT_LIST = new ArrayList<Product>();

    static {
        PRODUCT_LIST.add(PRODUCT1);
        PRODUCT_LIST.add(PRODUCT2);
        PRODUCT_LIST.add(PRODUCT3);
        PRODUCT_LIST.add(PRODUCT4);
        PRODUCT_LIST.add(PRODUCT5);
        PRODUCT_LIST.add(PRODUCT6);
        PRODUCT_LIST.add(PRODUCT7);
        PRODUCT_LIST.add(PRODUCT8);
        PRODUCT_LIST.add(PRODUCT9);
        PRODUCT_LIST.add(PRODUCT10);
        PRODUCT_LIST.add(PRODUCT11);
        PRODUCT_LIST.add(PRODUCT12);
        PRODUCT_LIST.add(PRODUCT13);
        PRODUCT_LIST.add(PRODUCT14);
        PRODUCT_LIST.add(PRODUCT15);
        PRODUCT_LIST.add(PRODUCT16);
        PRODUCT_LIST.add(PRODUCT17);
        PRODUCT_LIST.add(PRODUCT18);
        PRODUCT_LIST.add(PRODUCT19);
        PRODUCT_LIST.add(PRODUCT20);
        PRODUCT_LIST.add(PRODUCT21);
        PRODUCT_LIST.add(PRODUCT22);
        PRODUCT_LIST.add(PRODUCT23);
        PRODUCT_LIST.add(PRODUCT24);
         }

    public static final String CURRENCY = "Rs";
}
