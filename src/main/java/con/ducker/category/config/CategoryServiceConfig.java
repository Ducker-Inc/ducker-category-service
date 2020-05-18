package con.ducker.category.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.ducker.model")
public class CategoryServiceConfig {
}
