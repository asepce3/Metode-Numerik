package asep.cahyana.siedel;

import asep.cahyana.Utils;

import java.util.ArrayList;
import java.util.List;

public class GaussSiedel {

    public List<Item> siedel(double x, double y, double z) {
        List<Item> items = new ArrayList<>();
        Item item = init(x, y, z);
        items.add(item);

        int i = 0;
        while (true) {
            item = next(items.get(i));
            items.add(item);
            i++;
            if (items.get(i).getX() == items.get(i-1).getX() &&
                    items.get(i).getY() == items.get(i-1).getY() &&
                    items.get(i).getZ() == items.get(i-1).getZ()) break;
        }

        return items;
    }

    private Item init(double x, double y, double z) {
        return new Item(
                Utils.inRoundTwoDigits(x),
                Utils.inRoundTwoDigits(y),
                Utils.inRoundTwoDigits(z)
        );
    }

    private Item next(Item item) {
        Item newItem = new Item();
        newItem.setX(x(item.getY(), item.getZ()));
        newItem.setY(y(newItem.getX(), item.getZ()));
        newItem.setZ(z(newItem.getX(), newItem.getY()));

        return newItem;
    }

    /**
     * x = (15 - y - 2z) / 4
     */
    private double x(double y, double z) {
        double yTwo = Utils.inRoundTwoDigits(y);
        double zTwo = Utils.inRoundTwoDigits(z);
        double result = (15 - yTwo - 2*zTwo) / 4;

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * y = 10 - 2x - z
     */
    private double y(double x, double z) {
        double xTwo = Utils.inRoundTwoDigits(x);
        double zTwo = Utils.inRoundTwoDigits(z);
        double result = 10 - 2*xTwo - zTwo;

        return Utils.inRoundTwoDigits(result);
    }

    /**
     * z = (16 - 2x - y) / 3
     */
    private double z(double x, double y) {
        double xTwo = Utils.inRoundTwoDigits(x);
        double yTwo = Utils.inRoundTwoDigits(y);
        double result = (16 - 2*xTwo - yTwo) / 3;

        return Utils.inRoundTwoDigits(result);
    }
}
