package com.javarush.task.task27.task2712.statistic.event;

import java.util.Date;

public interface EventDataRow {
    EventType getType(); // вернет тип события
    Date getDate(); // вернет дату создания записи
    int getTime();  // вернет время или продолжительность.
}
