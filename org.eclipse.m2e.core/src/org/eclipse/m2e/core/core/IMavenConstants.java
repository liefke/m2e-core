/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.core.core;

import org.eclipse.core.runtime.QualifiedName;

/**
 * Maven Constants
 * 
 * @author Eugene Kuleshov
 */
public interface IMavenConstants {

  public static final String PLUGIN_ID = "org.eclipse.m2e.core"; //$NON-NLS-1$

  public static final String NATURE_ID = PLUGIN_ID + ".maven2Nature"; //$NON-NLS-1$

  public static final String BUILDER_ID = PLUGIN_ID + ".maven2Builder"; //$NON-NLS-1$

  public static final String MARKER_ID = PLUGIN_ID + ".maven2Problem"; //$NON-NLS-1$

  public static final String MARKER_POM_LOADING_ID = MARKER_ID + ".pomloading"; //$NON-NLS-1$

  public static final String MARKER_CONFIGURATION_ID = MARKER_ID + ".configuration"; //$NON-NLS-1$

  public static final String MARKER_DEPENDENCY_ID = MARKER_ID + ".dependency"; //$NON-NLS-1$

  public static final String MARKER_BUILD_ID = MARKER_ID + ".build"; //$NON-NLS-1$
  
  /**
   * string that gets included in pom.xml file comments and makes the marker manager to ignore
   * the managed version override marker
   */
  public static final String MARKER_IGNORE_MANAGED = "$NO-MVN-MAN-VER$";//$NON-NLS-1$ 

  public static final String MAVEN_COMPONENT_CONTRIBUTORS_XPT = PLUGIN_ID + ".mavenComponentContributors"; //$NON-NLS-1$
  
  public static final String POM_FILE_NAME = "pom.xml"; //$NON-NLS-1$

  public static final String PREFERENCE_PAGE_ID = PLUGIN_ID + ".MavenProjectPreferencePage"; //$NON-NLS-1$
  
  public static final String NO_WORKSPACE_PROJECTS = "noworkspace"; //$NON-NLS-1$

  public static final String ACTIVE_PROFILES = "profiles"; //$NON-NLS-1$

  public static final String FILTER_RESOURCES = "filterresources"; //$NON-NLS-1$

  public static final String JAVADOC_CLASSIFIER = "javadoc"; //$NON-NLS-1$

  public static final String SOURCES_CLASSIFIER = "sources"; //$NON-NLS-1$

  
  /** 
   * Session property key used to indicate that full maven build was requested for a project.
   * It is not intended to be used by clients directly.
   */
  public static final QualifiedName FULL_MAVEN_BUILD = new QualifiedName(PLUGIN_ID, "fullBuild"); //$NON-NLS-1$

  /**
   * The name of the folder containing metadata information for the workspace.
   */
  public static final String METADATA_FOLDER = ".metadata"; //$NON-NLS-1$

  public static final String INDEX_UPDATE_PROP = "indexUpdate"; //$NON-NLS-1$

  public static final String MARKER_ATTR_EDITOR_HINT = "editor_hint";

  public static final String EDITOR_HINT_PARENT_GROUP_ID = "parent_groupid";

  public static final String EDITOR_HINT_PARENT_VERSION = "parent_version";

  public static final String EDITOR_HINT_MANAGED_DEPENDENCY_OVERRIDE = "managed_dependency_override";

  public static final String EDITOR_HINT_MANAGED_PLUGIN_OVERRIDE = "managed_plugin_override";

  public static final String EDITOR_HINT_MISSING_SCHEMA = "missing_schema";

}