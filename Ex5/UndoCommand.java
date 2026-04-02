public class UndoCommand implements ConsoleCommand {

    private static ChangeCommand last = new ChangeCommand();

    @Override
    public char getKey() { return 'u'; }

    @Override
    public void execute() {
        last.undo();
    }

    @Override
    public void undo() {}
}