package refactoring_guru.chain_of_responsibility.example.middleware;

public interface Handler {
    boolean check(String email, String password);
    boolean checkNext(String email, String password);
}
