package com.car.center.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClientPK implements Serializable {

    @Column(name = "documento")
    private Integer document;

    @Column(name = "tipo_documento")
    private String documentType;

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientPK clientPK = (ClientPK) o;
        return Objects.equals(document, clientPK.document) && Objects.equals(documentType, clientPK.documentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(document, documentType);
    }
}
