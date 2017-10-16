package myprojects.automation.utils;

/**
 * All parameters that are passed to automation project
 */
public enum EnvironmentVariables {
    BASE_URL("env.url"),
    BASE_ADMIN_URL("env.admin.url"),
    BROWSER("browser");

    private String value;
    EnvironmentVariables(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
