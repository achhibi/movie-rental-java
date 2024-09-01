package movierental;

public final class Movies {

    private Movies() {
    }   // Prevents instantiation

    public static Movie regular(String name) {
        return new RegularMovie(name);
    }

    public static Movie newRelease(String name) {
        return new NewReleaseMovie(name);
    }

    public static Movie children(String name) {
        return new ChildrensMovie(name);
    }
}
