/*
 *  Copyright 2001-present Stephen Colebourne
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/**
 * Mock person JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
@BeanDefinition(builderScope = "public")
public class SimplePersonWithBuilderNonFinal implements Cloneable, Bean {

    /** The forename. */
    @PropertyDefinition
    private String forename;
    /** The surname. */
    @PropertyDefinition(validate = "notNull")
    private final String surname;
    /** The number of cars. */
    @PropertyDefinition
    private transient int numberOfCars;
    @PropertyDefinition
    private final List<Address> addressList = new ArrayList<Address>();
    @PropertyDefinition(validate = "notNull")
    private final Map<String, Address> otherAddressMap = new HashMap<String, Address>();
    @PropertyDefinition(validate = "notNull")
    private final List<List<Address>> addressesList = new ArrayList<List<Address>>();
    @PropertyDefinition
    private Address mainAddress;

    //------------------------- AUTOGENERATED START -------------------------
    ///CLOVER:OFF
    /**
     * The meta-bean for {@code SimplePersonWithBuilderNonFinal}.
     * @return the meta-bean, not null
     */
    public static SimplePersonWithBuilderNonFinal.Meta meta() {
        return SimplePersonWithBuilderNonFinal.Meta.INSTANCE;
    }

    static {
        JodaBeanUtils.registerMetaBean(SimplePersonWithBuilderNonFinal.Meta.INSTANCE);
    }

    /**
     * Returns a builder used to create an instance of the bean.
     * @return the builder, not null
     */
    public static SimplePersonWithBuilderNonFinal.Builder builder() {
        return new SimplePersonWithBuilderNonFinal.Builder();
    }

    /**
     * Restricted constructor.
     * @param builder  the builder to copy from, not null
     */
    protected SimplePersonWithBuilderNonFinal(SimplePersonWithBuilderNonFinal.Builder builder) {
        JodaBeanUtils.notNull(builder.surname, "surname");
        JodaBeanUtils.notNull(builder.addressList, "addressList");
        JodaBeanUtils.notNull(builder.otherAddressMap, "otherAddressMap");
        JodaBeanUtils.notNull(builder.addressesList, "addressesList");
        this.forename = builder.forename;
        this.surname = builder.surname;
        this.numberOfCars = builder.numberOfCars;
        this.addressList.addAll(builder.addressList);
        this.otherAddressMap.putAll(builder.otherAddressMap);
        this.addressesList.addAll(builder.addressesList);
        this.mainAddress = builder.mainAddress;
    }

    @Override
    public SimplePersonWithBuilderNonFinal.Meta metaBean() {
        return SimplePersonWithBuilderNonFinal.Meta.INSTANCE;
    }

    @Override
    public <R> Property<R> property(String propertyName) {
        return metaBean().<R>metaProperty(propertyName).createProperty(this);
    }

    @Override
    public Set<String> propertyNames() {
        return metaBean().metaPropertyMap().keySet();
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the forename.
     * @return the value of the property
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the forename.
     * @param forename  the new value of the property
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Gets the the {@code forename} property.
     * @return the property, not null
     */
    public final Property<String> forename() {
        return metaBean().forename().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property, not null
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the the {@code surname} property.
     * @return the property, not null
     */
    public final Property<String> surname() {
        return metaBean().surname().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the number of cars.
     * @return the value of the property
     */
    public int getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Sets the number of cars.
     * @param numberOfCars  the new value of the property
     */
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    /**
     * Gets the the {@code numberOfCars} property.
     * @return the property, not null
     */
    public final Property<Integer> numberOfCars() {
        return metaBean().numberOfCars().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressList.
     * @return the value of the property, not null
     */
    public List<Address> getAddressList() {
        return addressList;
    }

    /**
     * Sets the addressList.
     * @param addressList  the new value of the property, not null
     */
    public void setAddressList(List<Address> addressList) {
        JodaBeanUtils.notNull(addressList, "addressList");
        this.addressList.clear();
        this.addressList.addAll(addressList);
    }

    /**
     * Gets the the {@code addressList} property.
     * @return the property, not null
     */
    public final Property<List<Address>> addressList() {
        return metaBean().addressList().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the otherAddressMap.
     * @return the value of the property, not null
     */
    public Map<String, Address> getOtherAddressMap() {
        return otherAddressMap;
    }

    /**
     * Sets the otherAddressMap.
     * @param otherAddressMap  the new value of the property, not null
     */
    public void setOtherAddressMap(Map<String, Address> otherAddressMap) {
        JodaBeanUtils.notNull(otherAddressMap, "otherAddressMap");
        this.otherAddressMap.clear();
        this.otherAddressMap.putAll(otherAddressMap);
    }

    /**
     * Gets the the {@code otherAddressMap} property.
     * @return the property, not null
     */
    public final Property<Map<String, Address>> otherAddressMap() {
        return metaBean().otherAddressMap().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the addressesList.
     * @return the value of the property, not null
     */
    public List<List<Address>> getAddressesList() {
        return addressesList;
    }

    /**
     * Sets the addressesList.
     * @param addressesList  the new value of the property, not null
     */
    public void setAddressesList(List<List<Address>> addressesList) {
        JodaBeanUtils.notNull(addressesList, "addressesList");
        this.addressesList.clear();
        this.addressesList.addAll(addressesList);
    }

    /**
     * Gets the the {@code addressesList} property.
     * @return the property, not null
     */
    public final Property<List<List<Address>>> addressesList() {
        return metaBean().addressesList().createProperty(this);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the mainAddress.
     * @return the value of the property
     */
    public Address getMainAddress() {
        return mainAddress;
    }

    /**
     * Sets the mainAddress.
     * @param mainAddress  the new value of the property
     */
    public void setMainAddress(Address mainAddress) {
        this.mainAddress = mainAddress;
    }

    /**
     * Gets the the {@code mainAddress} property.
     * @return the property, not null
     */
    public final Property<Address> mainAddress() {
        return metaBean().mainAddress().createProperty(this);
    }

    //-----------------------------------------------------------------------
    @Override
    public SimplePersonWithBuilderNonFinal clone() {
        return JodaBeanUtils.cloneAlways(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            SimplePersonWithBuilderNonFinal other = (SimplePersonWithBuilderNonFinal) obj;
            return JodaBeanUtils.equal(getForename(), other.getForename()) &&
                    JodaBeanUtils.equal(getSurname(), other.getSurname()) &&
                    (getNumberOfCars() == other.getNumberOfCars()) &&
                    JodaBeanUtils.equal(getAddressList(), other.getAddressList()) &&
                    JodaBeanUtils.equal(getOtherAddressMap(), other.getOtherAddressMap()) &&
                    JodaBeanUtils.equal(getAddressesList(), other.getAddressesList()) &&
                    JodaBeanUtils.equal(getMainAddress(), other.getMainAddress());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = getClass().hashCode();
        hash = hash * 31 + JodaBeanUtils.hashCode(getForename());
        hash = hash * 31 + JodaBeanUtils.hashCode(getSurname());
        hash = hash * 31 + JodaBeanUtils.hashCode(getNumberOfCars());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAddressList());
        hash = hash * 31 + JodaBeanUtils.hashCode(getOtherAddressMap());
        hash = hash * 31 + JodaBeanUtils.hashCode(getAddressesList());
        hash = hash * 31 + JodaBeanUtils.hashCode(getMainAddress());
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(256);
        buf.append("SimplePersonWithBuilderNonFinal{");
        int len = buf.length();
        toString(buf);
        if (buf.length() > len) {
            buf.setLength(buf.length() - 2);
        }
        buf.append('}');
        return buf.toString();
    }

    protected void toString(StringBuilder buf) {
        buf.append("forename").append('=').append(JodaBeanUtils.toString(getForename())).append(',').append(' ');
        buf.append("surname").append('=').append(JodaBeanUtils.toString(getSurname())).append(',').append(' ');
        buf.append("numberOfCars").append('=').append(JodaBeanUtils.toString(getNumberOfCars())).append(',').append(' ');
        buf.append("addressList").append('=').append(JodaBeanUtils.toString(getAddressList())).append(',').append(' ');
        buf.append("otherAddressMap").append('=').append(JodaBeanUtils.toString(getOtherAddressMap())).append(',').append(' ');
        buf.append("addressesList").append('=').append(JodaBeanUtils.toString(getAddressesList())).append(',').append(' ');
        buf.append("mainAddress").append('=').append(JodaBeanUtils.toString(getMainAddress())).append(',').append(' ');
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code SimplePersonWithBuilderNonFinal}.
     */
    public static class Meta extends DirectMetaBean {
        /**
         * The singleton instance of the meta-bean.
         */
        static final Meta INSTANCE = new Meta();

        /**
         * The meta-property for the {@code forename} property.
         */
        private final MetaProperty<String> forename = DirectMetaProperty.ofReadWrite(
                this, "forename", SimplePersonWithBuilderNonFinal.class, String.class);
        /**
         * The meta-property for the {@code surname} property.
         */
        private final MetaProperty<String> surname = DirectMetaProperty.ofReadOnlyBuildable(
                this, "surname", SimplePersonWithBuilderNonFinal.class, String.class);
        /**
         * The meta-property for the {@code numberOfCars} property.
         */
        private final MetaProperty<Integer> numberOfCars = DirectMetaProperty.ofReadWrite(
                this, "numberOfCars", SimplePersonWithBuilderNonFinal.class, Integer.TYPE);
        /**
         * The meta-property for the {@code addressList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<Address>> addressList = DirectMetaProperty.ofReadWrite(
                this, "addressList", SimplePersonWithBuilderNonFinal.class, (Class) List.class);
        /**
         * The meta-property for the {@code otherAddressMap} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<Map<String, Address>> otherAddressMap = DirectMetaProperty.ofReadWrite(
                this, "otherAddressMap", SimplePersonWithBuilderNonFinal.class, (Class) Map.class);
        /**
         * The meta-property for the {@code addressesList} property.
         */
        @SuppressWarnings({"unchecked", "rawtypes" })
        private final MetaProperty<List<List<Address>>> addressesList = DirectMetaProperty.ofReadWrite(
                this, "addressesList", SimplePersonWithBuilderNonFinal.class, (Class) List.class);
        /**
         * The meta-property for the {@code mainAddress} property.
         */
        private final MetaProperty<Address> mainAddress = DirectMetaProperty.ofReadWrite(
                this, "mainAddress", SimplePersonWithBuilderNonFinal.class, Address.class);
        /**
         * The meta-properties.
         */
        private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
                this, null,
                "forename",
                "surname",
                "numberOfCars",
                "addressList",
                "otherAddressMap",
                "addressesList",
                "mainAddress");

        /**
         * Restricted constructor.
         */
        protected Meta() {
        }

        @Override
        protected MetaProperty<?> metaPropertyGet(String propertyName) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return forename;
                case -1852993317:  // surname
                    return surname;
                case 926656063:  // numberOfCars
                    return numberOfCars;
                case -1377524046:  // addressList
                    return addressList;
                case 1368089592:  // otherAddressMap
                    return otherAddressMap;
                case -226885792:  // addressesList
                    return addressesList;
                case -2032731141:  // mainAddress
                    return mainAddress;
            }
            return super.metaPropertyGet(propertyName);
        }

        @Override
        public SimplePersonWithBuilderNonFinal.Builder builder() {
            return new SimplePersonWithBuilderNonFinal.Builder();
        }

        @Override
        public Class<? extends SimplePersonWithBuilderNonFinal> beanType() {
            return SimplePersonWithBuilderNonFinal.class;
        }

        @Override
        public Map<String, MetaProperty<?>> metaPropertyMap() {
            return metaPropertyMap$;
        }

        //-----------------------------------------------------------------------
        /**
         * The meta-property for the {@code forename} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> forename() {
            return forename;
        }

        /**
         * The meta-property for the {@code surname} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<String> surname() {
            return surname;
        }

        /**
         * The meta-property for the {@code numberOfCars} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Integer> numberOfCars() {
            return numberOfCars;
        }

        /**
         * The meta-property for the {@code addressList} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<Address>> addressList() {
            return addressList;
        }

        /**
         * The meta-property for the {@code otherAddressMap} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Map<String, Address>> otherAddressMap() {
            return otherAddressMap;
        }

        /**
         * The meta-property for the {@code addressesList} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<List<List<Address>>> addressesList() {
            return addressesList;
        }

        /**
         * The meta-property for the {@code mainAddress} property.
         * @return the meta-property, not null
         */
        public final MetaProperty<Address> mainAddress() {
            return mainAddress;
        }

        //-----------------------------------------------------------------------
        @Override
        protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return ((SimplePersonWithBuilderNonFinal) bean).getForename();
                case -1852993317:  // surname
                    return ((SimplePersonWithBuilderNonFinal) bean).getSurname();
                case 926656063:  // numberOfCars
                    return ((SimplePersonWithBuilderNonFinal) bean).getNumberOfCars();
                case -1377524046:  // addressList
                    return ((SimplePersonWithBuilderNonFinal) bean).getAddressList();
                case 1368089592:  // otherAddressMap
                    return ((SimplePersonWithBuilderNonFinal) bean).getOtherAddressMap();
                case -226885792:  // addressesList
                    return ((SimplePersonWithBuilderNonFinal) bean).getAddressesList();
                case -2032731141:  // mainAddress
                    return ((SimplePersonWithBuilderNonFinal) bean).getMainAddress();
            }
            return super.propertyGet(bean, propertyName, quiet);
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    ((SimplePersonWithBuilderNonFinal) bean).setForename((String) newValue);
                    return;
                case -1852993317:  // surname
                    if (quiet) {
                        return;
                    }
                    throw new UnsupportedOperationException("Property cannot be written: surname");
                case 926656063:  // numberOfCars
                    ((SimplePersonWithBuilderNonFinal) bean).setNumberOfCars((Integer) newValue);
                    return;
                case -1377524046:  // addressList
                    ((SimplePersonWithBuilderNonFinal) bean).setAddressList((List<Address>) newValue);
                    return;
                case 1368089592:  // otherAddressMap
                    ((SimplePersonWithBuilderNonFinal) bean).setOtherAddressMap((Map<String, Address>) newValue);
                    return;
                case -226885792:  // addressesList
                    ((SimplePersonWithBuilderNonFinal) bean).setAddressesList((List<List<Address>>) newValue);
                    return;
                case -2032731141:  // mainAddress
                    ((SimplePersonWithBuilderNonFinal) bean).setMainAddress((Address) newValue);
                    return;
            }
            super.propertySet(bean, propertyName, newValue, quiet);
        }

        @Override
        protected void validate(Bean bean) {
            JodaBeanUtils.notNull(((SimplePersonWithBuilderNonFinal) bean).surname, "surname");
            JodaBeanUtils.notNull(((SimplePersonWithBuilderNonFinal) bean).addressList, "addressList");
            JodaBeanUtils.notNull(((SimplePersonWithBuilderNonFinal) bean).otherAddressMap, "otherAddressMap");
            JodaBeanUtils.notNull(((SimplePersonWithBuilderNonFinal) bean).addressesList, "addressesList");
        }

    }

    //-----------------------------------------------------------------------
    /**
     * The bean-builder for {@code SimplePersonWithBuilderNonFinal}.
     */
    public static class Builder extends DirectFieldsBeanBuilder<SimplePersonWithBuilderNonFinal> {

        private String forename;
        private String surname;
        private int numberOfCars;
        private List<Address> addressList = ImmutableList.of();
        private Map<String, Address> otherAddressMap = ImmutableMap.of();
        private List<List<Address>> addressesList = ImmutableList.of();
        private Address mainAddress;

        /**
         * Restricted constructor.
         */
        protected Builder() {
        }

        /**
         * Restricted copy constructor.
         * @param beanToCopy  the bean to copy from, not null
         */
        protected Builder(SimplePersonWithBuilderNonFinal beanToCopy) {
            this.forename = beanToCopy.getForename();
            this.surname = beanToCopy.getSurname();
            this.numberOfCars = beanToCopy.getNumberOfCars();
            this.addressList = ImmutableList.copyOf(beanToCopy.getAddressList());
            this.otherAddressMap = ImmutableMap.copyOf(beanToCopy.getOtherAddressMap());
            this.addressesList = ImmutableList.copyOf(beanToCopy.getAddressesList());
            this.mainAddress = beanToCopy.getMainAddress();
        }

        //-----------------------------------------------------------------------
        @Override
        public Object get(String propertyName) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    return forename;
                case -1852993317:  // surname
                    return surname;
                case 926656063:  // numberOfCars
                    return numberOfCars;
                case -1377524046:  // addressList
                    return addressList;
                case 1368089592:  // otherAddressMap
                    return otherAddressMap;
                case -226885792:  // addressesList
                    return addressesList;
                case -2032731141:  // mainAddress
                    return mainAddress;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
        }

        @SuppressWarnings("unchecked")
        @Override
        public Builder set(String propertyName, Object newValue) {
            switch (propertyName.hashCode()) {
                case 467061063:  // forename
                    this.forename = (String) newValue;
                    break;
                case -1852993317:  // surname
                    this.surname = (String) newValue;
                    break;
                case 926656063:  // numberOfCars
                    this.numberOfCars = (Integer) newValue;
                    break;
                case -1377524046:  // addressList
                    this.addressList = (List<Address>) newValue;
                    break;
                case 1368089592:  // otherAddressMap
                    this.otherAddressMap = (Map<String, Address>) newValue;
                    break;
                case -226885792:  // addressesList
                    this.addressesList = (List<List<Address>>) newValue;
                    break;
                case -2032731141:  // mainAddress
                    this.mainAddress = (Address) newValue;
                    break;
                default:
                    throw new NoSuchElementException("Unknown property: " + propertyName);
            }
            return this;
        }

        @Override
        public Builder set(MetaProperty<?> property, Object value) {
            super.set(property, value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder setString(String propertyName, String value) {
            setString(meta().metaProperty(propertyName), value);
            return this;
        }

        /**
         * @deprecated Use Joda-Convert in application code
         */
        @Override
        @Deprecated
        public Builder setString(MetaProperty<?> property, String value) {
            super.setString(property, value);
            return this;
        }

        /**
         * @deprecated Loop in application code
         */
        @Override
        @Deprecated
        public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
            super.setAll(propertyValueMap);
            return this;
        }

        @Override
        public SimplePersonWithBuilderNonFinal build() {
            return new SimplePersonWithBuilderNonFinal(this);
        }

        //-----------------------------------------------------------------------
        /**
         * Sets the forename.
         * @param forename  the new value
         * @return this, for chaining, not null
         */
        public Builder forename(String forename) {
            this.forename = forename;
            return this;
        }

        /**
         * Sets the surname.
         * @param surname  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder surname(String surname) {
            JodaBeanUtils.notNull(surname, "surname");
            this.surname = surname;
            return this;
        }

        /**
         * Sets the number of cars.
         * @param numberOfCars  the new value
         * @return this, for chaining, not null
         */
        public Builder numberOfCars(int numberOfCars) {
            this.numberOfCars = numberOfCars;
            return this;
        }

        /**
         * Sets the addressList.
         * @param addressList  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder addressList(List<Address> addressList) {
            JodaBeanUtils.notNull(addressList, "addressList");
            this.addressList = addressList;
            return this;
        }

        /**
         * Sets the {@code addressList} property in the builder
         * from an array of objects.
         * @param addressList  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder addressList(Address... addressList) {
            return addressList(ImmutableList.copyOf(addressList));
        }

        /**
         * Sets the otherAddressMap.
         * @param otherAddressMap  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder otherAddressMap(Map<String, Address> otherAddressMap) {
            JodaBeanUtils.notNull(otherAddressMap, "otherAddressMap");
            this.otherAddressMap = otherAddressMap;
            return this;
        }

        /**
         * Sets the addressesList.
         * @param addressesList  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder addressesList(List<List<Address>> addressesList) {
            JodaBeanUtils.notNull(addressesList, "addressesList");
            this.addressesList = addressesList;
            return this;
        }

        /**
         * Sets the {@code addressesList} property in the builder
         * from an array of objects.
         * @param addressesList  the new value, not null
         * @return this, for chaining, not null
         */
        public Builder addressesList(List<Address>... addressesList) {
            return addressesList(ImmutableList.copyOf(addressesList));
        }

        /**
         * Sets the mainAddress.
         * @param mainAddress  the new value
         * @return this, for chaining, not null
         */
        public Builder mainAddress(Address mainAddress) {
            this.mainAddress = mainAddress;
            return this;
        }

        //-----------------------------------------------------------------------
        @Override
        public String toString() {
            StringBuilder buf = new StringBuilder(256);
            buf.append("SimplePersonWithBuilderNonFinal.Builder{");
            int len = buf.length();
            toString(buf);
            if (buf.length() > len) {
                buf.setLength(buf.length() - 2);
            }
            buf.append('}');
            return buf.toString();
        }

        protected void toString(StringBuilder buf) {
            buf.append("forename").append('=').append(JodaBeanUtils.toString(forename)).append(',').append(' ');
            buf.append("surname").append('=').append(JodaBeanUtils.toString(surname)).append(',').append(' ');
            buf.append("numberOfCars").append('=').append(JodaBeanUtils.toString(numberOfCars)).append(',').append(' ');
            buf.append("addressList").append('=').append(JodaBeanUtils.toString(addressList)).append(',').append(' ');
            buf.append("otherAddressMap").append('=').append(JodaBeanUtils.toString(otherAddressMap)).append(',').append(' ');
            buf.append("addressesList").append('=').append(JodaBeanUtils.toString(addressesList)).append(',').append(' ');
            buf.append("mainAddress").append('=').append(JodaBeanUtils.toString(mainAddress)).append(',').append(' ');
        }

    }

    ///CLOVER:ON
    //-------------------------- AUTOGENERATED END --------------------------
}
