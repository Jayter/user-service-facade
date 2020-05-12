package com.eugenet.user.service.facade.config;

import com.eugenet.configuration.TenantConnectionResolverConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(TenantConnectionResolverConfiguration.class)
public class UserServiceFacadeConfiguration {

}
