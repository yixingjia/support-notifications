/*******************************************************************************
 * Copyright 2016-2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * @microservice: support-notifications
 * @author: Cloud Tsai, Dell
 * @version: 1.0.0
 *******************************************************************************/

package org.edgexfoundry.support.notifications.service;

import java.util.List;

import org.edgexfoundry.support.domain.notifications.Notification;

public interface NotificationHandler {

  public void receiveNotification(Notification notification);

  public Notification findBySlug(String slug);

  public List<Notification> searchBySender(String sender);

  public List<Notification> searchBySender(String sender, int limit);

  public List<Notification> findByCreatedDuration(long start, long end);

  public List<Notification> findByCreatedDuration(long start, long end, int limit);

  public List<Notification> findByCreatedAfter(long start);

  public List<Notification> findByCreatedAfter(long start, int limit);

  public List<Notification> findByCreatedBefore(long end);

  public List<Notification> findByCreatedBefore(long end, int limit);

  public List<Notification> findInLabels(String[] labels);

  public List<Notification> findInLabels(String[] labels, int limit);

  public List<Notification> findNewNotifications();

  public List<Notification> findNewNotifications(int limit);

  public void deleteNotificationAndTransmissionsBySlug(String slug);

  public void deleteOldProcessedNotificationsAndTransmissions(long age);

}