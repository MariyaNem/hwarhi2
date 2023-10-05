package Rewards.Diamond;

/**
 * Класс DiamondGenerator является генератором алмазов.
 * Он наследует абстрактный класс ItemGenerator и реализует его метод createItem(),
 * чтобы создавать экземпляры алмазов (DiamondRewards).
 */

import Abstractions.IGameItem;
import Abstractions.ItemGenerator;

public class DiamondGenerator extends ItemGenerator {
    /**
     * Метод createItem() создает и возвращает новый экземпляр алмазов (DiamondRewards).
     * @return Новый экземпляр алмазов (DiamondRewards).
     */

    public IGameItem createItem() {
        return new DiamondRewards();
    }
}