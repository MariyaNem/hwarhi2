package Rewards.Silver;

/**
 * Класс SilverGenerator представляет собой генератор серебра.
 * Он наследует абстрактный класс ItemGenerator и реализует его метод createItem(),
 * чтобы создавать экземпляры серебряных наград (SilverRewards).
 */

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class SilverGenerator extends ItemGenerator {
    /**
     * Метод createItem() создает и возвращает новый экземпляр серебра (SilverRewards).
     * @return Новый экземпляр серебра (SilverRewards).
     */

    public IGameItem createItem() {
        return new SilverRewards();
    }
}
