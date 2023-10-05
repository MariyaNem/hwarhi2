package Rewards.Gold;

/**
 * Класс GoldGenerator отвечает за генерацию золота в игре.
 * Он наследует класс ItemGenerator и переопределяет метод createItem() для создания экземпляров золота (GoldRewards).
 */

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class GoldGenerator extends ItemGenerator {
    /**
     * Создает и возвращает новый экземпляр золота (GoldRewards).
     *
     * @return Новый экземпляр золота (GoldRewards).
     */
    public IGameItem createItem() {
        return new GoldRewards();
    }
}