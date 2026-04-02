public class ViewCommand implements ConsoleCommand {

    @Override
    public char getKey() { return 'v'; }

    @Override
    public void execute() {
        System.out.println(GenerateCommand.data);
    }

    @Override
    public void undo() {}
}