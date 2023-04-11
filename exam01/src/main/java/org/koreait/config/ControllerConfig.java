package org.koreait.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("org.koreait.controllers")
public class ControllerConfig {
}
