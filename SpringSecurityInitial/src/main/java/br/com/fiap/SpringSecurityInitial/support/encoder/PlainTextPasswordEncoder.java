package br.com.fiap.SpringSecurityInitial.support.encoder;

import org.jspecify.annotations.Nullable;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PlainTextPasswordEncoder implements PasswordEncoder {
    @Override
    public @Nullable String encode(@Nullable CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(@Nullable CharSequence rawPassword, @Nullable String encodedPassword) {
        return rawPassword.toString().equals(encodedPassword);
    }
}
