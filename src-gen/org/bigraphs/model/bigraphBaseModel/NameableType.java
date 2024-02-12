/**
 */
package org.bigraphs.model.bigraphBaseModel;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nameable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bigraphs.model.bigraphBaseModel.NameableType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getNameableType()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface NameableType extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelPackage#getNameableType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bigraphs.model.bigraphBaseModel.NameableType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NameableType
