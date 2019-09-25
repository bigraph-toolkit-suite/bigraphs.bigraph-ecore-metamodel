/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BigraphBaseModelFactoryImpl extends EFactoryImpl implements BigraphBaseModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BigraphBaseModelFactory init() {
		try {
			BigraphBaseModelFactory theBigraphBaseModelFactory = (BigraphBaseModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(BigraphBaseModelPackage.eNS_URI);
			if (theBigraphBaseModelFactory != null) {
				return theBigraphBaseModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BigraphBaseModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphBaseModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BigraphBaseModelPackage.BROOT:
			return (EObject) createBRoot();
		case BigraphBaseModelPackage.BNODE:
			return (EObject) createBNode();
		case BigraphBaseModelPackage.BSITE:
			return (EObject) createBSite();
		case BigraphBaseModelPackage.BPORT:
			return (EObject) createBPort();
		case BigraphBaseModelPackage.BINNER_NAME:
			return (EObject) createBInnerName();
		case BigraphBaseModelPackage.BEDGE:
			return (EObject) createBEdge();
		case BigraphBaseModelPackage.BOUTER_NAME:
			return (EObject) createBOuterName();
		case BigraphBaseModelPackage.BBIGRAPH:
			return (EObject) createBBigraph();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRoot createBRoot() {
		BRootImpl bRoot = new BRootImpl();
		return bRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BNode createBNode() {
		BNodeImpl bNode = new BNodeImpl();
		return bNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSite createBSite() {
		BSiteImpl bSite = new BSiteImpl();
		return bSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPort createBPort() {
		BPortImpl bPort = new BPortImpl();
		return bPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BInnerName createBInnerName() {
		BInnerNameImpl bInnerName = new BInnerNameImpl();
		return bInnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEdge createBEdge() {
		BEdgeImpl bEdge = new BEdgeImpl();
		return bEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOuterName createBOuterName() {
		BOuterNameImpl bOuterName = new BOuterNameImpl();
		return bOuterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBigraph createBBigraph() {
		BBigraphImpl bBigraph = new BBigraphImpl();
		return bBigraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphBaseModelPackage getBigraphBaseModelPackage() {
		return (BigraphBaseModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BigraphBaseModelPackage getPackage() {
		return BigraphBaseModelPackage.eINSTANCE;
	}

} //BigraphBaseModelFactoryImpl
