/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BBigraph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BBigraphImpl#getBRoots <em>BRoots</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BBigraphImpl#getBEdges <em>BEdges</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BBigraphImpl#getBInnerNames <em>BInner Names</em>}</li>
 *   <li>{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BBigraphImpl#getBOuterNames <em>BOuter Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BBigraphImpl extends CDOObjectImpl implements BBigraph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BBigraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BigraphBaseModelPackage.Literals.BBIGRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BRoot> getBRoots() {
		return (EList<BRoot>) eGet(BigraphBaseModelPackage.Literals.BBIGRAPH__BROOTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BEdge> getBEdges() {
		return (EList<BEdge>) eGet(BigraphBaseModelPackage.Literals.BBIGRAPH__BEDGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BInnerName> getBInnerNames() {
		return (EList<BInnerName>) eGet(BigraphBaseModelPackage.Literals.BBIGRAPH__BINNER_NAMES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BOuterName> getBOuterNames() {
		return (EList<BOuterName>) eGet(BigraphBaseModelPackage.Literals.BBIGRAPH__BOUTER_NAMES, true);
	}

} //BBigraphImpl
