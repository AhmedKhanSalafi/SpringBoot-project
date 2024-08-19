package springBoot.Dto.dto.dto;

public class UserDto {

    private String name;
    private String email;

    // NoArgsConstructor
    public UserDto() {
        super();
    }

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
