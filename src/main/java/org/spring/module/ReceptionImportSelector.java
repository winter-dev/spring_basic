package org.spring.module;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author kk
 * @date 2023/10/30 15:53
 * @apiNote Selector
 */
public class ReceptionImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Reception.class.getName(),ReceptionConfiguration.class.getName()};
    }
}
