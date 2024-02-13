package atom.mining.exception;

public class ErrorEcxeption extends Throwable { // 1 Throwable наследование должно быть от Exception, если иного явно не требует бизнс-логика
    // 2 ErrorEcxeption - некорректное название, классы ошибок не должны быть общими (или не должны быть выброшены), содержания слов Error и Exception,
    // смешивает понятия, грамматическая ошибка
    public ErrorEcxeption(String message) {
        super(message);
    }
}
