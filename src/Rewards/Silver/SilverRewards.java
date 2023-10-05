package Rewards.Silver;

/**
 * Класс SilverRewards представляет собой награду в виде серебра.
 * Реализует интерфейс IGameItem для определения метода open(), который возвращает название награды.
 */

import Abstractions.IGameItem;

public class SilverRewards implements IGameItem {
    /**
     * Метод open() возвращает название награды - серебро.
     * @return Название серебряной награды ("Серебро").
     */
    @Override
    public String open() {
        return "Серебро";
    }
}