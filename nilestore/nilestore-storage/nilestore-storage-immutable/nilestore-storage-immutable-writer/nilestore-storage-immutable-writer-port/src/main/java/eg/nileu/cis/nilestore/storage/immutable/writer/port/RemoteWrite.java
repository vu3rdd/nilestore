/**
 * This file is part of the Nilestore project.
 * 
 * Copyright (C) (2011) Nile University (NU)
 *
 * Nilestore is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package eg.nileu.cis.nilestore.storage.immutable.writer.port;

import eg.nileu.cis.nilestore.common.ComponentAddress;
import eg.nileu.cis.nilestore.common.ExtMessage;

// TODO: Auto-generated Javadoc
/**
 * The Class RemoteWrite.
 * 
 * @author Mahmoud Ismail <mahmoudahmedismail@gmail.com>
 */
public class RemoteWrite extends ExtMessage {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -70820243710750209L;

	/** The offset. */
	private final long offset;

	/** The data. */
	private final byte[] data;

	/**
	 * Instantiates a new remote write.
	 * 
	 * @param source
	 *            the source
	 * @param destination
	 *            the destination
	 * @param offset
	 *            the offset
	 * @param data
	 *            the data
	 */
	public RemoteWrite(ComponentAddress source, ComponentAddress destination,
			long offset, byte[] data) {
		super(source, destination);
		this.data = data;
		this.offset = offset;
	}

	/**
	 * Gets the offset.
	 * 
	 * @return the offset
	 */
	public long getOffset() {
		return offset;
	}

	/**
	 * Gets the data.
	 * 
	 * @return the data
	 */
	public byte[] getData() {
		return data;
	}

}
