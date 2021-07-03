package models;

public class Store {
    Item[][] items;

    public Store() {
        this.items = new Item[7][3];
    }

    /**
     * @return the item
     */
    public Item getItem(int row, int column) {
        return new Item(this.items[row][column]);
    }

    /**
     * @param item the item to set
     */
    public void setItem(int row, int column, Item item) {
        this.items[row][column] = new Item(item);
    }

    public String toString() {
        String temp = "";

        for (int i = 0; i < items.length; i++) {
            switch (i) {
                case 0:
                    temp += "\tDRINKS:        ";
                    break;
                case 1:
                    temp += "\tCEREAL:        ";
                    break;
                case 2:
                    temp += "\tDAIRY:         ";
                    break;
                case 3:
                    temp += "\tDELI:          ";
                    break;
                case 4:
                    temp += "\tGREENS:        ";
                    break;
                case 5:
                    temp += "\tCLOTHING:      ";
                    break;
                case 6:
                    temp += "\tELECTRONICS:   ";
                    break;
            }
            for (int j = 0; j < items[0].length; j++) {
                temp += this.items[i][j] + " ";
            }
            temp += "\n";
        }
        return temp;
    }
}
