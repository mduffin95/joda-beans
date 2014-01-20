/*
 *  Copyright 2001-2014 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans.gen;

import java.util.Map;

import org.joda.beans.Bean;
import org.joda.beans.BeanBuilder;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

/**
 * Mock used for subclass validation.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition
public class SubValidateBean extends ValidateBean {

    /**
     * The sub non-null value.
     */
    @PropertyDefinition(validate = "notNull")
    private String sub;

    public SubValidateBean() {
    }

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code SubValidateBean}.
     * @return the meta-bean, not null
     */
    public static SubValidateBean.Meta meta() {
        return SubValidateBean.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(SubValidateBean.Meta.INSTANCE);
    }

    @Override
    public SubValidateBean.Meta metaBean() {
        return SubValidateBean.Meta.INSTANCE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the sub non-null value.
     * @return the value of the property, not null
     */
    public String getSub() {
        return sub;
    }

    /**
     * Sets the sub non-null value.
     * @param sub  the new value of the property, not null
     */
    public void setSub(String sub) {
        JodaBeanUtils.notNull(sub, "sub");
        this.sub = sub;
    }

    /**
     * Gets the the {@code sub} property.
     * @return the property, not null
     */
    public final Property<String> sub() {
        return metaBean().sub().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public SubValidateBean clone() {
        return (SubValidateBean) super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            SubValidateBean other = (SubValidateBean) obj;
            return JodaBeanUtils.equal(getSub(), other.getSub()) &&
                    super.equals(obj);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash += hash * 31 + JodaBeanUtils.hashCode(getSub());
        return hash ^ super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(64);
        buf.append("SubValidateBean{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    @Override
    protected void toString(StringBuilder buf) {
        super.toString(buf);
        buf.append("sub").append('=').append(JodaBeanUtils.toString(getSub())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code SubValidateBean}.
     */
    public static class Meta extends ValidateBean.Meta {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code sub} property.
         */
        private final MetaProperty<String> sub = DirectMetaProperty.ofReadWrite(
                this, "sub", SubValidateBean.class, String.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, (DirectMetaPropertyMap) super.metaPropertyMap(),
                "sub");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 114240:  // sub
                    return sub;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public BeanBuilder<? extends SubValidateBean> builder() {
            return new DirectBeanBuilder<SubValidateBean>(new SubValidateBean());
        }

        @Override
        public Class<? extends SubValidateBean> beanType() {
            return SubValidateBean.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code sub} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> sub() {
            return sub;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 114240:  // sub
                    return ((SubValidateBean) bean).getSub();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 114240:  // sub
                    ((SubValidateBean) bean).setSub((String) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((SubValidateBean) bean).sub, "sub");
            super.validate(bean);
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
