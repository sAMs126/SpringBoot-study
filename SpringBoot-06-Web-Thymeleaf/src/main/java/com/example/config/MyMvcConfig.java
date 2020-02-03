package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MVC customizations
 * 扩展 Spring MVC 的相关配置
 *
 * @author sAMs126
 * @date 2020/02/02
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
	/**
	 * Configure simple automated controllers pre-configured with the response
	 * status code and/or a view to render the response body. This is useful in
	 * cases where there is no need for custom controller logic -- e.g. render a
	 * home page, perform simple site URL redirects, return a 404 status with
	 * HTML content, a 204 with no content, and more.
	 *
	 * @param registry 视图控制注册器
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/welcome")
				.setStatusCode(HttpStatus.OK)
				.setViewName("welcome");
	}
}
