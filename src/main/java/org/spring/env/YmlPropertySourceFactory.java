package org.spring.env;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author kk
 * @date 2023/11/2 10:49
 * @apiNote
 */
public class YmlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {

        YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
        // 传入resource资源文件
        yamlPropertiesFactoryBean.setResources(resource.getResource());
        // 直接解析获得Properties对象
        Properties properties = yamlPropertiesFactoryBean.getObject();
        // 如果@PropertySource没有指定name，则使用资源文件的文件名
        return new PropertiesPropertySource((name != null ? name : resource.getResource().getFilename()), properties);
    }
}
