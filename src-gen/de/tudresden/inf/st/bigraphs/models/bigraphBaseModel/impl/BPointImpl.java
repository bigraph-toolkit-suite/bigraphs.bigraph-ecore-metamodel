/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPointImpl#getBLink <em>BLink</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BPointImpl extends MinimalEObjectImpl.Container implements BPoint {
	/**
	 * The cached value of the '{@link #getBLink() <em>BLink</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLink()
	 * @generated
	 * @ordered
	 */
	protected BLink bLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLink getBLink() {
		if (bLink != null && bLink.eIsProxy()) {
			InternalEObject oldBLink = (InternalEObject) bLink;
			bLink = (BLink) eResolveProxy(oldBLink);
			if (bLink != oldBLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BigraphBaseModelPackage.BPOINT__BLINK,
							oldBLink, bLink));
			}
		}
		return bLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLink basicGetBLink() {
		return bLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLink(BLink newBLink, NotificationChain msgs) {
		BLink oldBLink = bLink;
		bLink = newBLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BigraphBaseModelPackage.BPOINT__BLINK, oldBLink, newBLink);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLink(BLink newBLink) {
		if (newBLink != bLink) {
			NotificationChain msgs = null;
			if (bLink != null)
				msgs = ((InternalEObject) bLink).eInverseRemove(this, BigraphBaseModelPackage.BLINK__BPOINTS,
						BLink.class, msgs);
			if (newBLink != null)
				msgs = ((InternalEObject) newBLink).eInverseAdd(this, BigraphBaseModelPackage.BLINK__BPOINTS,
						BLink.class, msgs);
			msgs = basicSetBLink(newBLink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BigraphBaseModelPackage.BPOINT__BLINK, newBLink,
					newBLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BigraphBaseModelPackage.BPOINT__BLINK:
			if (bLink != null)
				msgs = ((InternalEObject) bLink).eInverseRemove(this, BigraphBaseModelPackage.BLINK__BPOINTS,
						BLink.class, msgs);
			return basicSetBLink((BLink) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BigraphBaseModelPackage.BPOINT__BLINK:
			return basicSetBLink(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BigraphBaseModelPackage.BPOINT__BLINK:
			if (resolve)
				return getBLink();
			return basicGetBLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BigraphBaseModelPackage.BPOINT__BLINK:
			setBLink((BLink) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BigraphBaseModelPackage.BPOINT__BLINK:
			setBLink((BLink) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BigraphBaseModelPackage.BPOINT__BLINK:
			return bLink != null;
		}
		return super.eIsSet(featureID);
	}

} //BPointImpl
